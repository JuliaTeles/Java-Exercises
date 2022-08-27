package aula9.listaex2;

import java.util.Scanner;

public class ContaEspecial extends ContaBancaria {
    private float limite; 

    public ContaEspecial(float limite, String cliente, int numConta, double saldo) {
        super(cliente, numConta, saldo);
        this.limite = limite;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
    
    @Override
    public void Sacar(){
       
        Scanner saque = new Scanner(System.in);
        System.out.println("Digite o valor a ser sacado: ");
        valor = saque.nextDouble();
        if (saldo<limite)
        {
            System.out.println("Você não pode estourar o limite!");
            System.out.println("Insira um valor válido!");
        }
        else
        {
            saldo = saldo - valor;
            System.out.println("Saldo na conta: " + saldo);
        }
    }
}
