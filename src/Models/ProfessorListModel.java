package Models;
import Entidades.Professor;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class ProfessorListModel extends AbstractTableModel {

    private final List<Professor> listaProfessor;

    private final String[] colunas = new String[]{"Código", "Nome", "CPF", "Gênero", "Data Nascimento", "Disciplina"};

    public ProfessorListModel(List<Professor> listaProfessor) {
        this.listaProfessor = listaProfessor;
    }   

    @Override
    public int getRowCount() {
        return listaProfessor.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Professor aluno = listaProfessor.get(row);
        switch (column) {
            case 0 -> {
                return aluno.getId();
            }
            case 1 -> {
                return aluno.getNome();
            }
            case 2 -> {
                return aluno.getCpf();
            }
            case 3 -> {
                return aluno.getGenero();
            }
            case 4 -> {
                return aluno.getDataNasc();
            }
            case 5 -> {
                return aluno.getDisciplina();
            }
            default -> {
            }
        }
        return aluno;
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    public void insertModel(Professor professor) {
        listaProfessor.add(professor);
        int ultimoIndice = getRowCount() - 1;
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }

    public void removeModel(int indexRow) {
        listaProfessor.remove(indexRow);
        fireTableRowsDeleted(indexRow, indexRow);
    }

    public void atualizarModel(int indiceLinha, Professor professor) {
        listaProfessor.set(indiceLinha, professor);
        fireTableRowsUpdated(indiceLinha, indiceLinha);
    }

}
