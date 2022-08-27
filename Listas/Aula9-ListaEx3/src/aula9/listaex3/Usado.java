package aula9.listaex3;

import java.util.Scanner;

public class Usado extends Imovel{
    private double desconto;

    public Usado(int codigo, String endereco, double preco) {
        super(codigo, endereco, preco);
     
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    
    @Override
    public void Acessar(){
        System.out.println("O imóvel de código: " + codigo);
        System.out.println("E endereço: " + endereco);
        System.out.println("Custa: " + preco);
        
        Scanner valorDesconto = new Scanner(System.in);
        System.out.println("Digite o valor adicional: ");
        desconto = valorDesconto.nextDouble();
        System.out.println("O valor desconto é: " + desconto);
        
        System.out.println("Novo preço: " + (preco-desconto));
    }
}
