package aula9.listaex3;

import java.util.Scanner;

public class Novo extends Imovel{
    private double adicional;

    public Novo(int codigo, String endereco, double preco) {
        super(codigo, endereco, preco);
        
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }
    
    @Override
    public void Acessar(){
        System.out.println("O imóvel de código: " + codigo);
        System.out.println("E endereço: " + endereco);
        System.out.println("Custa: " + preco);
        Scanner valorAdicional = new Scanner(System.in);
        System.out.println("Digite o valor adicional: ");
        adicional = valorAdicional.nextDouble();
        System.out.println("O valor adicional é: " + adicional);
        
        System.out.println("Novo preço: " + (preco+adicional));
    }
}
