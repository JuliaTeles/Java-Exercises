/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Estudante;
import model.dao.EstudanteDAO;

public class EstudanteControl {
    EstudanteDAO a1Dao;
    
    public EstudanteControl() {
       a1Dao = new EstudanteDAO(); 
    }
    
    public void cadastrar (int ra, String nome){
        Estudante a1 = new Estudante(ra, nome); 
        EstudanteDAO a1Dao = new EstudanteDAO();
        try {
            a1Dao.cadastrarEstudante(a1);
        } catch (SQLException ex) {
            Logger.getLogger(EstudanteControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

 
}
