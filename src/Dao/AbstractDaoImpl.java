package Dao;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractDaoImpl<T> implements AbstractDao<T> {

    protected Connection connection;

    @Override
    public Connection getConn() {
        Conexao conexao = Conexao.getInstance();
        connection = conexao.getConexao();
        return connection;
    }

    public void closePreparedStatement(PreparedStatement psmt)  {
        if (psmt == null) {
            return;
        }
        try {
            if (!psmt.isClosed()) {
                psmt.close();
            }
        } catch (SQLException ex) {
            File arquivo = new File(System.getProperty("user.dir") + "/src/erros.txt");
            if( !arquivo.exists()){
             try {
                 arquivo.createNewFile();
             } catch (IOException ex1) {
             }
            }
            List<String> lista = new ArrayList<>();
            lista.add("Erro no closePreparedStatement:");
            lista.add(ex.getMessage() + ", ocorrido neste hora: " + LocalDateTime.now().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

             try {
                 Files.write(Paths.get(arquivo.getPath()), lista, StandardOpenOption.APPEND);
             } catch (IOException ex1) {
             }
        }
    }

    public void closeResultSet(ResultSet rs) {
        if (rs == null) {
            return;
        }
        try {
            if (!rs.isClosed()) {
                rs.close(); 
            }
        } catch (SQLException ex) {
            File arquivo = new File(System.getProperty("user.dir") + "/src/erros.txt");
            if( !arquivo.exists()){
             try {
                 arquivo.createNewFile();
             } catch (IOException ex1) {
             }
            }
            List<String> lista = new ArrayList<>();
            lista.add("Erro no closeResultSet:");
            lista.add(ex.getMessage() + ", ocorrido neste hora: " + LocalDateTime.now().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

             try {
                 Files.write(Paths.get(arquivo.getPath()), lista, StandardOpenOption.APPEND);
             } catch (IOException ex1) {
             }
        }
    }
}
