package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class AbstractDaoImpl<T> implements AbstractDao<T> {

    protected Connection connection;

    public Connection getConn() {
        Conexao conexao = Conexao.getInstance();
        connection = conexao.getConexao();
        return connection;
    }

    public void closePreparedStatement(PreparedStatement psmt) {
        if (psmt == null) {
            return;
        }
        try {
            if (!psmt.isClosed()) {
                psmt.close();
            }
        } catch (SQLException ex) {
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
        }
    }
}
