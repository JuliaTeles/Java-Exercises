package aula9.listaex3;

import java.util.Scanner;

public class Imovel {
    protected int codigo;
    protected String endereco;
    protected double preco; 

    public Imovel(int codigo, String endereco, double preco) {
        this.codigo = codigo;
        this.endereco = endereco;
        this.preco = preco;
    }
    
    public void Acessar(){
        System.out.println("O imóvel de código: " + codigo);
        System.out.println("E endereço: " + endereco);
        System.out.println("Custa: " + preco);
    }
    
    
}
