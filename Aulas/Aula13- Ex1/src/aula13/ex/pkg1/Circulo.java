/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13.ex.pkg1;

/**
 *
 * @author aluno
 */
public class Circulo extends Forma {

    private double raio; 
    
    @Override
    public void calcularArea() {
        
        setArea(3.14*(raio*raio));
        //System.out.println("A area é " + a);
    }

    public double getRaio(){
        return raio;
    }

    public void setRaio(double raio){
        this.raio = raio;
    }

    
}
