
package model.dao;

import connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Floricultura;

public class FloriculturaDAO {
    Connection con; 
    
    public void cadastrarFloricultura(Floricultura a1) throws SQLException{
        con = new Conexao().getConnection();
        String sql = "Insert into Floricultura(VALOR,PRODUTO,DESCRICAO) values (?,?,?)";
        PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setFloat(1, a1.getValor());
            stmt.setString(2, a1.getProduto());
            stmt.setString(3, a1.getDescricao());
            stmt.execute();
            stmt.close();
            con.close();    
    }
    
    public void excluir(String produto) throws SQLException {
        con = new Conexao().getConnection();
        String sql = "DELETE FROM Floricultura WHERE PRODUTO = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, produto);
        stmt.execute();
        stmt.close();   
        
        con.close();
    }
    
    public ArrayList<Floricultura> buscarProdutos() throws SQLException{
        ResultSet rs;
        ArrayList<Floricultura> lista = new ArrayList();
        con = new Conexao().getConnection();
        String sql = "SELECT * FROM Floricultura";
        PreparedStatement stmt = con.prepareStatement(sql);
        rs = stmt.executeQuery();
        while (rs.next()){
            float valor = rs.getFloat("VALOR");
            String produto = rs.getString("PRODUTO");
            String descricao = rs.getString("DESCRICAO");
            
            Floricultura al = new Floricultura(valor,produto, descricao);
            lista.add(al);
        }
        stmt.close();
        con.close();
        return lista;
    }
}
        

