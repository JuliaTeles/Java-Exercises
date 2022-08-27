package aula7.ex1;

/*
Nome: Júlia Téles Cruz      RA:200558       3°INFD

Exercício 2:
Crie uma classe que contenha um método estático para retornar o menor de dois, três,
quatro e cinco valores inteiros (com um total de 4 métodos). Dica: os métodos podem ser chamados
em cascata: para calcular o maior de três valores a, b e c, pode-se calcular o maior valor de a e b, e
comparar esse resultado com c. Escreva um programa para demonstrar o funcionamento da classe.
*/

public class Aula7Ex1 {

    public static void main(String[] args) {
       
        Menor numb = new Menor();
        numb.comparar(30,20,15,0);
        
    }
    
}
