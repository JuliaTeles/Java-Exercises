package aula7.ex1;

/*
Nome: Júlia Téles Cruz      RA:200558       3°INFD

Exercício 2:
Crie uma classe que contenha um método estático para retornar o menor de dois, três,
quatro e cinco valores inteiros (com um total de 4 métodos). Dica: os métodos podem ser chamados
em cascata: para calcular o maior de três valores a, b e c, pode-se calcular o maior valor de a e b, e
comparar esse resultado com c. Escreva um programa para demonstrar o funcionamento da classe.
*/

public class Menor {
    private static double a;
    private static double b;
    private static double c;
    private static double d;
    private static double m;

    public static double getM() {
        return m;
    }

    public static void setM(double m) {
        Menor.m = m;
    }

    public static double getA() {
        return a;
    }

    public static void setA(double aA) {
        a = aA;
    }

    public static double getB() {
        return b;
    }

    public static void setB(double aB) {
        b = aB;
    }

    public static double getC() {
        return c;
    }

    public static void setC(double aC) {
        c = aC;
    }

    public static double getD() {
        return d;
    }

    public static void setD(double aD) {
        d = aD;
    }
    
    
    public void comparar(double a, double b, double c, double d)
    {
        
        if (a < b){
            m = a;
        }
        else{
            m = b;
        }
        
        if (m < c){
            m = m;
        }
        else
        {
            m = c;
        }
        
        if (m < d)
        {
            m = m;
        }
        else{
            m = d;
        }
        System.out.println("O menor número é " + m);
        
    }
    
}
