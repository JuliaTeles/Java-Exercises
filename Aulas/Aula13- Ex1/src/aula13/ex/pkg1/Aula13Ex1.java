package aula13.ex.pkg1;

/*

Aula 13, exemplo 1                     13.04.20022
Nome: Júlia Téles Cruz      RA: 200558      3ºINFD

 */

public class Aula13Ex1 {

    public static void main(String[] args) {
       //Forma f = new Forma();
       
       Circulo c = new Circulo();
       Quadrado q = new Quadrado();
       
       Forma f = new Quadrado();
       
       c.setRaio(2);
       c.calcularArea();
       System.out.println("A area do círculo é: " + c.getArea());
       
       System.out.println("-----------");
       
       q.setLado(2);
       q.calcularArea();
       System.out.println("A area do quadrasdo é: " + q.getArea());
       
    }  
    
    
}
   
 
           
