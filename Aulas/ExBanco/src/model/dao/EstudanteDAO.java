package model.dao;

import connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Estudante;

public class EstudanteDAO {
    Connection con; 
    
    public void cadastrarEstudante(Estudante a1) throws SQLException{
        con = new Conexao().getConnection();
        String sql = "Insert into Estudante(RA,NOME) values (?,?)";
        PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, a1.getRa());
            stmt.setString(2, a1.getNome());
            stmt.execute();
            stmt.close();
            con.close();    
    }
   
    
   /*
   public void excluir(int ra) throws SQLException {
        con = new Conexao().getConnection();
        String sql = "DELETE FROM Estudante WHERE RA = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, ra);
        stmt.execute();
        stmt.close();
        con.close();
    }
   
    public ArrayList<Estudante> buscarEstudantes() throws SQLException  {
        ResultSet rs;
        ArrayList<Estudante> lista = new ArrayList();
        con = new Conexao().getConnection();
        String sql = "SELECT * FROM Estudante";
        PreparedStatement stmt = con.prepareStatement(sql);
        rs = stmt.executeQuery();
        while (rs.next())
        {
            int ra = rs.getInt("RA");
            String nome = rs.getString("NOME");
            Estudante a1 = new Estudante(ra, nome);
            lista.add(a1);
        }
        stmt.close();
        con.close();   
        return lista;
    }
    
    public ArrayList<Estudante> buscarPorNome(String nomeEstudante) throws SQLException  {
        ResultSet rs;
        ArrayList<Estudante> lista = new ArrayList();
        
           con = new Conexao().getConnection();
           String sql = "SELECT * FROM Estudante WHERE NOME like ?";
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setString(1, nomeEstudante);
           rs = stmt.executeQuery();
           while (rs.next())
           {
               int ra = rs.getInt("RA");
               String nome = rs.getString("NOME");
               Estudante a1 = new Estudante(ra, nome);
               lista.add(a1);
           }
           stmt.close();
           con.close();   
           return lista;
    }*/
}
