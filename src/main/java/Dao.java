import java.sql.*;

public class Dao {
    Connection connection;
    PreparedStatement preparedStatement;
    ResultSet resultSet;

    public void open() throws Exception{
        String url = "jdbc:postgresql://localhost:5432/cadastros";
        String user = "postgres";
        String password = "898494";

        try {
            connection = DriverManager.getConnection(url, user, password);
        }catch (SQLException e){
            System.out.println("Erro ao Conectar ao Banco de Dados");
        }
    }
    public void close() throws Exception{
        preparedStatement.close();
        connection.close();
    }
}
