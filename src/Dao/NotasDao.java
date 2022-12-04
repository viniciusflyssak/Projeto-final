package Dao;

import Entidades.Notas;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;


public class NotasDao extends AbstractDaoImpl<Notas> {

    private PreparedStatement pstm;
    private ResultSet rs; 

    @Override
    public Notas insert(Notas notas) {
        try {
            pstm = getConn().prepareStatement(" INSERT INTO NOTAS(ANO, ID_ALUNO, ID_PROFESSOR, NOTA1, NOTA2, NOTA3, NOTA4) VALUES (?, ?, ?, ?, ?, ?, ?) ", 
                                              Statement.RETURN_GENERATED_KEYS);
            pstm.setInt(1, notas.getAno());
            pstm.setInt(2, notas.getIdAluno());
            pstm.setInt(3, notas.getIdProfessor());
            pstm.setDouble(4, notas.getNota1());
            pstm.setDouble(5, notas.getNota2());
            pstm.setDouble(6, notas.getNota3());
            pstm.setDouble(7, notas.getNota4());
            if (pstm.executeUpdate() > 0) { 
                rs = pstm.getGeneratedKeys();
                rs.next();
                notas.setId(rs.getInt("ID_NOTAS"));
                return notas;
            }
            return null;
        } catch (SQLException ex) {
            gravaLog(ex);
            JOptionPane.showMessageDialog(null, "Erro ao inserir notas! " + ex.getMessage());
            return null;
        } finally {
            super.closePreparedStatement(pstm);
            super.closeResultSet(rs);
        }

    }

    @Override
    public List<Notas> findAll() {
        try {
            pstm = getConn().prepareStatement("SELECT * FROM NOTAS");
            rs = pstm.executeQuery();
            return mountList();
        } catch (SQLException ex) {
            gravaLog(ex);
            JOptionPane.showMessageDialog(null, "Erro ao buscar notas! " + ex.getMessage());
            return null;
        } finally {
            super.closePreparedStatement(pstm);
            super.closeResultSet(rs);
        }
    }

    @Override
    public boolean delete(int id) {
        try {
            pstm = getConn().prepareStatement("DELETE FROM NOTAS WHERE ID_NOTAS = ?");
            pstm.setInt(1, id);
            return pstm.executeUpdate() > 0;
        } catch (SQLException ex) {
            gravaLog(ex);
            JOptionPane.showMessageDialog(null, "Erro ao excluir as notas! " + ex.getMessage());
            return false;
        } finally {
            super.closePreparedStatement(pstm);
        }
    }

    @Override
    public Notas findById(int id) {
        try {
            pstm = getConn().prepareStatement("SELECT * FROM NOTAS WHERE ID_NOTAS = ?");
            pstm.setInt(1, id);
            rs = pstm.executeQuery();
            if (rs.next()) {
                return mount(rs);
            }
            return null;
        } catch (SQLException ex) {
            gravaLog(ex);
            JOptionPane.showMessageDialog(null, "Erro ao buscar notas! " + ex.getMessage());
            return null;
        } finally {
            super.closePreparedStatement(pstm);
            super.closeResultSet(rs);
        }
    }

    @Override
    public Notas update(Notas notas) {
        try {
            pstm = getConn().prepareStatement(" UPDATE NOTAS "
                    + " SET ANO=? , ID_ALUNO=?, ID_PROFESSOR=?, "
                    + " NOTA1=?, NOTA2=?, NOTA3=?, NOTA4=? "
                    + "WHERE ID_NOTAS=?");

            pstm.setInt(1, notas.getAno());
            pstm.setInt(2, notas.getIdAluno());
            pstm.setInt(3, notas.getIdProfessor());
            pstm.setDouble(4, notas.getNota1());
            pstm.setDouble(5, notas.getNota2());
            pstm.setDouble(6, notas.getNota3());
            pstm.setDouble(7, notas.getNota4());
            pstm.setInt(8, notas.getId());
            if (pstm.executeUpdate() > 0) {
                return notas;
            }
            return null;
        } catch (SQLException ex) {
            gravaLog(ex);
            JOptionPane.showMessageDialog(null, "Erro ao atualizar notas! " + ex.getMessage());
            return null;
        } finally {
            super.closePreparedStatement(pstm);
            super.closeResultSet(rs);
        }
    }


    @Override
    public Notas mount(ResultSet res) {
        try {
            Notas notas = new Notas(rs.getInt("ID_NOTAS"), 
                                    rs.getDouble("NOTA1"), 
                                    rs.getDouble("NOTA2"), 
                                    rs.getDouble("NOTA3"), 
                                    rs.getDouble("NOTA4"),
                                    rs.getInt("ANO"),
                                    rs.getInt("ID_ALUNO"), 
                                    rs.getInt("ID_PROFESSOR"));
            return notas;
        } catch (SQLException ex) {
            gravaLog(ex);
            JOptionPane.showMessageDialog(null, "Erro ao criar notas! " + ex.getMessage());
            return null;
        }
    }

    @Override
    public List<Notas> mountList() {
        List<Notas> listaAlunos = new ArrayList();
        try {
            while (rs.next()) {
                Notas notas = mount(rs);
                listaAlunos.add(notas);
            }

        } catch (SQLException ex) {
            gravaLog(ex);
            JOptionPane.showMessageDialog(null, "Erro! " + ex.getMessage());
        }
        return listaAlunos;
    }

    private void gravaLog(SQLException ex){
        File arquivo = new File(System.getProperty("user.dir") + "/src/erros.txt");
        if( !arquivo.exists()){
         try {
             arquivo.createNewFile();
         } catch (IOException ex1) {
         }
        }
        List<String> lista = new ArrayList<>();
        lista.add("Erro na NotasDao:");
        lista.add(ex.getMessage() + ", ocorrido neste hora: " + LocalDateTime.now().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        try {
            Files.write(Paths.get(arquivo.getPath()), lista, StandardOpenOption.APPEND);
        } catch (IOException ex1) {
        }
    }
}
