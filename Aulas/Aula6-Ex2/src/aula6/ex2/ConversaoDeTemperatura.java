package aula6.ex2;

/*
Nome: Júlia Téles Cruz      RA:200558       3°INFD

Exercício 1:
Crie uma classe ConversaoDeTemperatura que contenha métodos estáticos para calcular a
conversão entre diferentes escalas de temperatura. Considere as fórmulas de conversão abaixo:
• De graus Celsius (C) para Fahrenheit (F): F=(C*1,8)+32
• De Fahrenheit (F) para graus Celsius (C): C=(F−32)/1,8
Escreva um programa em Java que, usando a classe ConversaoDeTemperatura, mostre quantos
graus Fahrenheit correspondem a zero e cem graus Celsius. Mostre também quantos graus Celsius
correspondem a 50 graus Fahrenheit.
*/

public class ConversaoDeTemperatura {
    private static double c;
    private static double f;

    public static double getC() {
        return c;
    }

    public static void setC(double c) {
        ConversaoDeTemperatura.c = c;
    }

    public static double getF() {
        return f;
    }

    public static void setF(double f) {
        ConversaoDeTemperatura.f = f;
    }
    
    public static void celsius(double c)
    {
        c = (c*1.8) + 32;
        System.out.println("A temperatura em celsius é: " + c);
        
    }

    public static void fahrenh(double f)
    {
        f = (f-32)/1.8;
        System.out.println("A temperatura em fahreinheit é: " + f);
        
    }
    
    
}
