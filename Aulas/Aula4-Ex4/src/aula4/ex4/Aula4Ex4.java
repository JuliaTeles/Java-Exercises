package aula4.ex4;


//Júlia Téeles Cruz     RA:200558       3°INFD

/*
Exercício 4:
Escreva uma classe em Java chamada Estoque. Ela deve possuir:
a. os atributos nome (String), qtdAtual (int) e qtdMinima (int).
b. um construtor sem parâmetros e um outro contendo os parâmetros nome,
qtdAtual e qtdMinima.
c. Os métodos get e set para cada atributo, assim como um método para
repor a quantidade em estoque e outro para dar baixa na quantidade em
estoque. O método repor aumenta a qtdAtual de acordo com um
parâmetro qtd. O método darBaixa diminui qtdAtual de acordo com um

parâmetro qtd. Os atributos qtdAtual e qtdMinima jamais poderão ser
negativos. A classe deve implementar um método mostra(), que retorna
uma String contendo o nome do produto, sua quantidade mínima e sua
quantidade atual. Também deve implementar um método precisaRepor,
que retorna true caso a quantidade atual esteja menor ou igual à
quantidade mínima e false, caso contrário.
*/


public class Aula4Ex4 {

    public static void main(String[] args) {
        Estoque estoque1 = new Estoque("Impressora", 13, 6);
        Estoque estoque2 = new Estoque("Monitor", 11, 13);
        Estoque estoque3 = new Estoque("Mouse", 6, 2);
        
        estoque1.darBaixa(5);
        estoque2.repor(7);
        
        estoque1.precisaRepor(estoque1.getQtdAtual(), estoque1.getQtdMinima());
        estoque2.precisaRepor(estoque2.getQtdAtual(), estoque2.getQtdMinima());
        estoque3.precisaRepor(estoque3.getQtdAtual(), estoque3.getQtdMinima());
        
        estoque1.mostra(estoque1.getNome(), estoque1.getQtdAtual(), estoque1.getQtdMinima());
        estoque2.mostra(estoque2.getNome(), estoque2.getQtdAtual(), estoque2.getQtdMinima());
        estoque3.mostra(estoque3.getNome(), estoque3.getQtdAtual(), estoque3.getQtdMinima());
    }
    
}
