package aula7.ex3;

/*
Nome: Júlia Téles Cruz      RA:200558       3°INFD

Exercício 4:
Existe um problema em potencial com a classe SimuladorDeCaixaDeBanco, mostrada
no código abaixo: se uma nova instância da classe for criada em uma aplicação onde já existam
algumas instâncias sendo usadas, o número do cliente será “resetado” (voltará a ser zero).
Modifique a classe para prevenir esse problema.
*/

public class Aula7Ex3 {

    public static void main(String[] args) {
        SimuladorCaixaBanco doze = new SimuladorCaixaBanco(2);
        doze.proximoAtendimento();
        
        SimuladorCaixaBanco treze = new SimuladorCaixaBanco(3);
        treze.proximoAtendimento();
    }
    
}
