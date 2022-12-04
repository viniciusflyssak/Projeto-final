package Models;
import Entidades.Notas;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class NotasListModel extends AbstractTableModel {

    private final List<Notas> listaNotas;

    private final String[] colunas = new String[]{"Código", "Ano", "Nota 1", "Nota 2", "Nota 3", "Nota 4", "Código aluno",
            "Nome aluno", "Código professor", "Nome professor"};

    public NotasListModel(List<Notas> listaNotas) {
        this.listaNotas = listaNotas;
    }   

    @Override
    public int getRowCount() {
        return listaNotas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Notas notas = listaNotas.get(row);
        switch (column) {
            case 0 -> {
                return notas.getId();
            }
            case 1 -> {
                return notas.getAno();
            }
            case 2 -> {
                return notas.getNota1();
            }
            case 3 -> {
                return notas.getNota2();
            }
            case 4 -> {
                return notas.getNota3();
            }
            case 5 -> {
                return notas.getNota4();
            }
            case 6 -> {
                return notas.getAluno().getId();
            }
            case 7 -> {
                return notas.getAluno().getNome();
            }
            case 8 -> {
                return notas.getProfessor().getId(); 
            }
            case 9 -> {
                return notas.getProfessor().getNome();
            }
            default -> {
            }
        }
        return notas;
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    public void insertModel(Notas notas) {
        listaNotas.add(notas);
        int ultimoIndice = getRowCount() - 1;
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }

    public void removeModel(int indexRow) {
        listaNotas.remove(indexRow);
        fireTableRowsDeleted(indexRow, indexRow);
    }

    public void atualizarModel(int indiceLinha, Notas notas) {
        listaNotas.set(indiceLinha, notas);
        fireTableRowsUpdated(indiceLinha, indiceLinha);
    }

}
