package ConectandoDatabase;

import java.sql.*;

public class Conexao {

    private Connection connection;

    public void conectar(String url, String usuario, String senha) throws SQLException{
        this.connection = DriverManager.getConnection(url, usuario, senha);
        System.out.printf("Eh somente leitura? %s\n", connection.isReadOnly());
    }

    public void inserir(String sql) throws SQLException{
        Statement statement = this.connection.createStatement();
        statement.execute("insert into vacina (nome) values ('covid') ");
        statement.close();
    }

    public ResultSet consultar(String sql) throws SQLException {
        Statement statementConsulta = this.connection.createStatement();
        ResultSet rs = connection.createStatement().executeQuery("select id, nome from vacina");
        return statementConsulta.executeQuery(sql);
    }

    public void desconectar() throws SQLException {
        connection.close();
    }
}
