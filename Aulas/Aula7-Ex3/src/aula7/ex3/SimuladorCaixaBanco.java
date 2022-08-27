package aula7.ex3;

/*
Nome: Júlia Téles Cruz      RA:200558       3°INFD

Exercício 4:
Existe um problema em potencial com a classe SimuladorDeCaixaDeBanco, mostrada
no código abaixo: se uma nova instância da classe for criada em uma aplicação onde já existam
algumas instâncias sendo usadas, o número do cliente será “resetado” (voltará a ser zero).
Modifique a classe para prevenir esse problema.
*/

public class SimuladorCaixaBanco {
    private static int numeroDoCliente;

    public static int getNumeroDoCliente() {
        return numeroDoCliente;
    }

    public static void setNumeroDoCliente(int aNumeroDoCliente) {
        numeroDoCliente = aNumeroDoCliente;
    }
    private int numeroDoCaixa;
    
    SimuladorCaixaBanco(int n)
    {
        numeroDoCaixa = n;
        System.out.println("Caixa "+numeroDoCaixa+" iniciou operação.");
    }

    public void proximoAtendimento()
    {
        numeroDoCliente++;
        System.out.print("Cliente com a senha no "+numeroDoCliente+" , favor ");
        System.out.println("dirigir-s ao caixa no "+numeroDoCaixa+".");
    }

    public int getNumeroDoCaixa() {
        return numeroDoCaixa;
    }

    public void setNumeroDoCaixa(int numeroDoCaixa) {
        this.numeroDoCaixa = numeroDoCaixa;
    }
}