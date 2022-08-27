package aula4.ex2;

//Júlia Téeles Cruz     RA:200558       3°INFD

/*
Exercício 2:
Crie uma classe chamada Item que uma loja de suprimentos de informática possa
utilizar para representar uma fatura de um item vendido na loja. Um Item faturado
deve ter quatro atributos: código, descrição, quantidade comprada do item,
preço do item. Sua classe deve ter um construtor que inicializa os quatro
atributos. Forneça métodos get e set para cada um dos atributos. Forneça também
um método chamado getTotal que calcula e retorna o total a pagar sobre o item
faturado (ou seja, quantidade * preço). Se a quantidade não for positiva, deve ser
configurada como zero. Idem para preço. Escreva um programa que teste a classe
Item.
*/

public class Aula4Ex2 {

    public static void main(String[] args) {
        Item mouse = new Item(100383, "Mouse preto", 2, 58.99);
        mouse.getTotal(mouse.getQuantidade(), mouse.getPreço());
    }
    
}
