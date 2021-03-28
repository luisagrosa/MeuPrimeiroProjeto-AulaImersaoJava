package ConectandoDatabase;

import java.sql.*;

public class Programa {

    public static void main(String[] args) throws SQLException {

        Conexao minhaConexao = new Conexao();

        // CONECTAR!

        String usuario = "admin";
        String senha = "Imers40JavaAdmin";
        //Padrao: jdbc:tipoDeBanco://urlBanco:porta/database
        String url = "jdbc:postgresql://165.227.108.225:5432/db_aluno4";
        minhaConexao.conectar(url, usuario, senha);


        //INSERIR DADOS NUMA TABELA - comentei tudo pois inseri na classe conexao, como metodo
        //Statement statement = connection.createStatement();
        //statement.execute("insert into vacina (nome) values ('covid') ");
        //statement.close();

        String sql = "insert into vacina (nome) values ('covid') ";
        minhaConexao.inserir(sql);

        //CONSULTAR OS DADOS INSERIDOS
        //Statement statementConsulta = connection.createStatement();
        //ResultSet rs = connection.createStatement().executeQuery("select id, nome from vacina");
        //System.out.println(rs);

        String sqlConsulta = "select * from vacina";
        ResultSet rs = minhaConexao.consultar(sqlConsulta);

        while(rs.next()){
            System.out.println(rs.getInt("id"));
            System.out.println(rs.getString("nome"));
        }

        minhaConexao.desconectar();
    }
}
