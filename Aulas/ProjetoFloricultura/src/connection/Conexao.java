package connection;

import java.sql.Connection;
import static java.lang.System.exit;
import java.sql.DriverManager;
import java.sql.SQLException;

// Conexão - ProjetoFloricultura

public class Conexao {
    public Connection getConnection(){
        String url = "jdbc:mysql://143.106.241.3:3306/cl200558";
        String usuario = "cl200558";
        String senha = "cl*30092004";
            try{
                return DriverManager.getConnection(url, usuario, senha);
            }catch(SQLException ex){
                System.out.println("Erro de conexão " + ex.toString());
                exit(1);
                return null;
            }
    }
}
