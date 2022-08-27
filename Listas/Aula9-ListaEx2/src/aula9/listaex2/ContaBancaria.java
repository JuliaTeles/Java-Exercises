package aula9.listaex2;

import java.util.Scanner;

public class ContaBancaria {
  private String cliente;
  private int numConta;
  protected double saldo;
  protected double valor;

    public ContaBancaria(String cliente, int numConta, double saldo) {
        this.cliente = cliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
 
    public void Sacar(){
       
        Scanner saque = new Scanner(System.in);
        System.out.println("Digite o valor a ser sacado: ");
        valor = saque.nextDouble();
        if (saldo<valor)
        {
            System.out.println("Você ficará endividado!");
            System.out.println("Insira um valor válido!");
        }
        else
        {
            saldo = saldo - valor;
            System.out.println("Saldo na conta: " + saldo);
        }
    }
    
    public void Depositar(){
        
        Scanner deposito = new Scanner(System.in);
        System.out.println("Digite o valor a ser depositado: ");
        valor = deposito.nextDouble();
        if (valor<0)
        {
            System.out.println("Insira um valor válido!");
        }
        else
        {
            saldo = saldo + valor;
            System.out.println("Saldo na conta: " + saldo);
        }
    }
    
    public void Mostrar(){
        System.out.println("Nome: " + cliente);
        System.out.println("Número da conta: " + numConta);
        System.out.println("Saldo atual: " + saldo);
    }
  
  
  
}
