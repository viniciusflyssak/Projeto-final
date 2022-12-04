package Dao;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Conexao {

    private final String URL = "jdbc:postgresql://motty.db.elephantsql.com:5432/hsmnqvah";
    private final String USUARIO = "hsmnqvah";
    private final String SENHA = "JHndeGcQlkM8uBxVQphr4m6jwhzs7R9i";
    private Connection conexao;
    private static Conexao instancia;

    private Conexao() {
    try {
        conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
        System.out.println("Conectou");
    } catch (SQLException ex) {
       JOptionPane.showMessageDialog(null, "Erro ao conectar. " + ex.getMessage());
       File arquivo = new File(System.getProperty("user.dir") + "/src/erros.txt");
       if( !arquivo.exists()){
        try {
            arquivo.createNewFile();
        } catch (IOException ex1) {
        }
       }
       List<String> lista = new ArrayList<>();
       lista.add("Erro na conexao:");
       lista.add(ex.getMessage() + ", ocorrido neste hora: " + LocalDateTime.now().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        try {
            Files.write(Paths.get(arquivo.getPath()), lista, StandardOpenOption.APPEND);
        } catch (IOException ex1) {
        }
    }
}

    public Connection getConexao() {
        return conexao;
    }
    
    
    public static Conexao getInstance() {
       if(instancia == null){
          instancia = new Conexao();
       }
       
       return instancia;
    }
}
