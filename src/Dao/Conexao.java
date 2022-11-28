package Dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
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
        }

    }

    public Connection getConexao() {
        return conexao;
    }
    
    
    public static Conexao getInstance(){
       if(instancia == null){
          instancia = new Conexao();
       }
       
       return instancia;
    }
}
