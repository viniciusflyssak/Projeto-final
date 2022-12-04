package Dao;

import Entidades.Aluno;
import Entidades.Genero;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.Date;
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


public class AlunoDao extends AbstractDaoImpl<Aluno> {

    private PreparedStatement pstm;
    private ResultSet rs; 

    @Override
    public Aluno insert(Aluno aluno) {
        try {
            pstm = getConn().prepareStatement(" INSERT INTO ALUNOS(NOME, CPF, SEXO, DATA_NASCIMENTO, EMAIL, SERIE) VALUES (?, ?, ?, ?, ?, ?) ", 
                                              Statement.RETURN_GENERATED_KEYS);
            pstm.setString(1, aluno.getNome());
            pstm.setString(2, aluno.getCpf());
            pstm.setString(3, aluno.getGenero().toString());
            pstm.setDate(4, Date.valueOf(aluno.getDataNasc()));
            pstm.setString(5, aluno.getEmail());
            pstm.setString(6, aluno.getSerie());
            if (pstm.executeUpdate() > 0) { 
                rs = pstm.getGeneratedKeys();
                rs.next();
                aluno.setId(rs.getInt("ID_ALUNO"));
                return aluno;
            }
            return null;
        } catch (SQLException ex) {
            gravaLog(ex);
            JOptionPane.showMessageDialog(null, "Erro ao inserir aluno! " + ex.getMessage());
            return null;
        } finally {
            super.closePreparedStatement(pstm);
            super.closeResultSet(rs);
        }

    }

    @Override
    public List<Aluno> findAll() {
        try {
            pstm = getConn().prepareStatement("SELECT * FROM ALUNOS");
            rs = pstm.executeQuery();
            return mountList();
        } catch (SQLException ex) {
            gravaLog(ex);
            JOptionPane.showMessageDialog(null, "Erro ao buscar alunos! " + ex.getMessage());
            return null;
        } finally {
            super.closePreparedStatement(pstm);
            super.closeResultSet(rs);
        }
    }

    @Override
    public boolean delete(int id) {
        try {
            pstm = getConn().prepareStatement("DELETE FROM NOTAS WHERE ID_ALUNO = ?");
            pstm.setInt(1, id);
            pstm.executeUpdate();
            super.closePreparedStatement(pstm);
            pstm = getConn().prepareStatement("DELETE FROM ALUNOS WHERE ID_ALUNO = ?");
            pstm.setInt(1, id);
            return pstm.executeUpdate() > 0;
        } catch (SQLException ex) {
            gravaLog(ex);
            JOptionPane.showMessageDialog(null, "Erro ao excluir o aluno! " + ex.getMessage());
            return false;
        } finally {
            super.closePreparedStatement(pstm);
        }
    }

    @Override
    public Aluno findById(int id) {
        try {
            pstm = getConn().prepareStatement("SELECT * FROM ALUNOS WHERE ID_ALUNO = ?");
            pstm.setInt(1, id);
            rs = pstm.executeQuery();
            if (rs.next()) {
                return mount(rs);
            }
            return null;
        } catch (SQLException ex) {
            gravaLog(ex);
            JOptionPane.showMessageDialog(null, "Erro ao buscar aluno! " + ex.getMessage());
            return null;
        } finally {
            super.closePreparedStatement(pstm);
            super.closeResultSet(rs);
        }
    }

    @Override
    public Aluno update(Aluno aluno) {
        try {
            pstm = getConn().prepareStatement("UPDATE ALUNOS "
                    + "SET NOME=?, CPF=?, SEXO=?, DATA_NASCIMENTO=?, EMAIL=?, SERIE=?"
                    + "WHERE ID_ALUNO=?");

            pstm.setString(1, aluno.getNome());
            pstm.setString(2, aluno.getCpf());
            pstm.setString(3, aluno.getGenero().toString());
            pstm.setDate(4, Date.valueOf(aluno.getDataNasc()));
            pstm.setString(5, aluno.getEmail());
            pstm.setString(6, aluno.getSerie());
            pstm.setInt(7, aluno.getId());
            if (pstm.executeUpdate() > 0) {
                return aluno;
            }
            return null;
        } catch (SQLException ex) {
            gravaLog(ex);
            JOptionPane.showMessageDialog(null, "Erro ao atualizar aluno! " + ex.getMessage());
            return null;
        } finally {
            super.closePreparedStatement(pstm);
            super.closeResultSet(rs);
        }
    }


    @Override
    public Aluno mount(ResultSet res) {
        try {
            Genero sexo;
            System.out.println(rs.getString("SEXO"));
            if (rs.getString("SEXO").equals("Masculino")){
                sexo = Genero.MASCULINO;
            }else{
                if(rs.getString("SEXO").equals("Feminino")){
                    sexo = Genero.FEMININO;
                }else{
                    sexo = Genero.OUTRO;
                }
            }
            Aluno aluno = new Aluno(rs.getString("SERIE"), 
                                    rs.getInt("ID_ALUNO"), 
                                    rs.getString("NOME"), 
                                    sexo,
                                    rs.getString("EMAIL"), 
                                    rs.getString("CPF"),
                                    rs.getDate("DATA_NASCIMENTO").toLocalDate());
            return aluno;
        } catch (SQLException ex) {
            gravaLog(ex);
            JOptionPane.showMessageDialog(null, "Erro ao criar aluno! " + ex.getMessage());
            return null;
        }
    }

    @Override
    public List<Aluno> mountList() {
        List<Aluno> listaAlunos;
        listaAlunos = new ArrayList();
        try {
            while (rs.next()) {
                Aluno aluno = mount(rs);
                listaAlunos.add(aluno);
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
        lista.add("Erro na AlunoDao:");
        lista.add(ex.getMessage() + ", ocorrido neste hora: " + LocalDateTime.now().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        try {
            Files.write(Paths.get(arquivo.getPath()), lista, StandardOpenOption.APPEND);
        } catch (IOException ex1) {
        }
    }
}
