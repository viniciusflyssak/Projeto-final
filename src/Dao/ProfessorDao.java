package Dao;

import Entidades.Genero;
import Entidades.Professor;
import java.sql.Date;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.Statement;


public class ProfessorDao extends AbstractDaoImpl<Professor> {

    private PreparedStatement pstm;
    private ResultSet rs; 

    @Override
    public Professor insert(Professor professor) {
        try {
            pstm = getConn().prepareStatement(" INSERT INTO PROFESSORES(NOME, CPF, SEXO, DATA_NASCIMENTO, EMAIL, DISCIPLINA) VALUES (?, ?, ?, ?, ?, ?) ", 
                                              Statement.RETURN_GENERATED_KEYS);
            pstm.setString(1, professor.getNome());
            pstm.setString(2, professor.getCpf());
            pstm.setString(3, professor.getGenero().toString());
            pstm.setDate(4, Date.valueOf(professor.getDataNasc()));
            pstm.setString(5, professor.getEmail());
            pstm.setString(6, professor.getDisciplina());
            if (pstm.executeUpdate() > 0) { 
                rs = pstm.getGeneratedKeys();
                rs.next();
                professor.setId(rs.getInt("ID_PROFESSOR"));
                return professor;
            }
            return null;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir professor! " + ex.getMessage());
            return null;
        } finally {
            super.closePreparedStatement(pstm);
            super.closeResultSet(rs);
        }

    }

    @Override
    public List<Professor> findAll() {
        try {
            pstm = getConn().prepareStatement("SELECT * FROM PROFESSORES");
            rs = pstm.executeQuery();
            return mountList();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar PROFESSOR! " + ex.getMessage());
            return null;
        } finally {
            super.closePreparedStatement(pstm);
            super.closeResultSet(rs);
        }
    }

    @Override
    public boolean delete(int id) {
        try {
            pstm = getConn().prepareStatement("DELETE FROM PROFESSOR WHERE ID_PROFESSOR = ?");
            pstm.setInt(1, id);
            return pstm.executeUpdate() > 0;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir o professor! " + ex.getMessage());
            return false;
        } finally {
            super.closePreparedStatement(pstm);
        }
    }

    @Override
    public Professor findById(int id) {
        try {
            pstm = getConn().prepareStatement("SELECT * FROM PROFESSORES WHERE ID_PROFESSOR = ?");
            pstm.setInt(1, id);
            rs = pstm.executeQuery();
            if (rs.next()) {
                return mount(rs);
            }
            return null;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar professor! " + ex.getMessage());
            return null;
        } finally {
            super.closePreparedStatement(pstm);
            super.closeResultSet(rs);
        }
    }

    @Override
    public Professor update(Professor professor) {
        try {
            pstm = getConn().prepareStatement("UPDATE PROFESSORES "
                    + "SET NOME=?, CPF=?, SEXO=?, DATA_NASCIMENTO=?, EMAIL=?, DISCIPLINA=?"
                    + "WHERE ID_PROFESSOR=?");

            pstm.setString(1, professor.getNome());
            pstm.setString(2, professor.getCpf());
            pstm.setString(3, professor.getGenero().toString());
            pstm.setDate(4, Date.valueOf(professor.getDataNasc()));
            pstm.setString(5, professor.getEmail());
            pstm.setString(5, professor.getDisciplina());
            pstm.setInt(7, professor.getId());
            if (pstm.executeUpdate() > 0) {
                return professor;
            }
            return null;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar professor! " + ex.getMessage());
            return null;
        } finally {
            super.closePreparedStatement(pstm);
            super.closeResultSet(rs);
        }
    }


    @Override
    public Professor mount(ResultSet res) {
        try {
            Genero sexo;
            if (rs.getString("SEXO") == "Masculino"){
                sexo = Genero.MASCULINO;
            }else{
                if(rs.getString("SEXO") == "Feminino"){
                    sexo = Genero.FEMININO;
                }else{
                    sexo = Genero.OUTRO;
                }
            }
            Professor professor = new Professor(rs.getString("DISCIPLINA"), 
                                                rs.getInt("ID_ALUNO"), 
                                                rs.getString("NOME"), 
                                                sexo, 
                                                rs.getString("EMAIL"), 
                                                rs.getString("CPF"),
                                                rs.getDate("DATA_NASCIMENTO").toLocalDate());
            return professor;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao criar professor! " + ex.getMessage());
            return null;
        }
    }

    @Override
    public List<Professor> mountList() {
        List<Professor> listaAlunos = new ArrayList();
        try {
            while (rs.next()) {
                Professor professor = mount(rs);
                listaAlunos.add(professor);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro! " + ex.getMessage());
        }
        return listaAlunos;
    }

}
