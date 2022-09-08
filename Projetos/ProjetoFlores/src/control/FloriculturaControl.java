package control;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Floricultura;
import model.dao.FloriculturaDAO;


public class FloriculturaControl {
    FloriculturaDAO a1Dao;
    
    public FloriculturaControl() {
       a1Dao = new FloriculturaDAO(); 
    }
    
    public void cadastrar (float valor, String produto, String descricao){
        Floricultura a1 = new Floricultura(valor, produto, descricao); 
        FloriculturaDAO a1Dao = new FloriculturaDAO();
        try {
            a1Dao.cadastrarFloricultura(a1);
        }catch (SQLException ex) {
            Logger.getLogger(FloriculturaControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void excluirFloricultura(String produto) throws SQLException{
        FloriculturaDAO alDao = new FloriculturaDAO();
        alDao.excluir(produto);
    } 
    
    public ArrayList<Floricultura> buscar () throws SQLException{
        FloriculturaDAO alDao = new FloriculturaDAO();
        return(alDao.buscarProdutos());
    }
 
}
