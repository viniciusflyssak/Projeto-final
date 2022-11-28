package Models;
import Entidades.Aluno;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class AlunoListModel extends AbstractTableModel {

    private List<Aluno> listaAluno;

    private String[] colunas = new String[]{"Código", "Nome", "CPF", "Gênero", "Data Nascimento", "Serie"};

    public AlunoListModel(List<Aluno> listaAluno) {
        this.listaAluno = listaAluno;
    }   

    @Override
    public int getRowCount() {
        return listaAluno.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Aluno aluno = listaAluno.get(row);
        switch (column) {
            case 0:
                return aluno.getId();
            case 1:
                return aluno.getNome();
            case 2:
                return aluno.getCpf();
            case 3:
                return aluno.getGenero();
            case 4:
                return aluno.getDataNasc();
            case 5:
                return aluno.getSerie();
            default:
                break;
        }
        return aluno;
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    public void insertModel(Aluno aluno) {
        listaAluno.add(aluno);
        int ultimoIndice = getRowCount() - 1;
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }

    public void removeModel(int indexRow) {
        listaAluno.remove(indexRow);
        fireTableRowsDeleted(indexRow, indexRow);
    }

    public void atualizarModel(int indiceLinha, Aluno aluno) {
        listaAluno.set(indiceLinha, aluno);
        fireTableRowsUpdated(indiceLinha, indiceLinha);
    }

}
