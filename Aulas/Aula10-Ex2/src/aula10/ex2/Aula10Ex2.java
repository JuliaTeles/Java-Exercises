package aula10.ex2;

/*
    Nome: Júlia Téles Cruz      05/04/22        3°INFD
    Aula 10, exemplo 2
    Treino de polimorfismo
*/

public class Aula10Ex2 {

    public static void main(String[] args) {
        Quadrilatero q1 = new Retangulo(2,4);
        
        System.out.println(q1.calcArea());
        
        Quadrilatero q2 = new Trapezio(3,3,5);
        //Trapezio t1 = (Trapezio) q2;
        //t1.setBaseMaior(3);
        
        System.out.println(q2.calcArea());
    }
    
}
