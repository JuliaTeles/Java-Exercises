package aula15.ex1;

/*

Aula 15, exemplo 1                     03.05.20022
Nome: Júlia Téles Cruz      RA: 200558      3ºINFD

 */

public class Aula15Ex1 {

    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        try{
          a1.setRa(-1);  
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        
        
        try{
            a1.setNome("");
            //a1.setNome(null);
        }
        catch(NullPointerException | StringVaziaException e){
            System.out.println(e.getMessage());                                                                                                                          
        }
    }
    
}
