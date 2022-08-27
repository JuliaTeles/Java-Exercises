
package lista.excecoes.pkg2.ex.pkg2;

/*

Aula 16, Lista de Exceções 2 - Exercício 2    04.05.20022
Nome: Júlia Téles Cruz      RA: 200558      3ºINFD

Crie uma classe ContaBancaria, que representa uma conta bancária genérica e não
pode ser instanciada. Esta classe deve ter um atributo saldo (visível apenas para ela e para
as suas subclasses) e os métodos depositar(double), sacar(double) e transferir(double,
ContaBancaria). Estes métodos devem depositar um valor na conta, sacar um valor da
conta e transferir um valor da conta de origem para uma conta de destino,
respectivamente. Além destes, ContaBancaria deve ter um método calcularSaldo(). Este
método possui a regra do cálculo do saldo final (que pode ser diferente do saldo
armazenado no atributo saldo) e deve ser obrigatoriamente implementado pelas
subclasses de ContaBancaria, pois cada classe possui suas próprias regras de cálculo.
Crie duas subclasses de ContaBancaria: ContaCorrente e ContaInvestimento.
Cada uma deverá implementar suas regras para calcular o saldo (método calcularSaldo()).
No caso de ContaCorrente, o saldo final é o saldo atual subtraído de 10%, referente a
impostos que devem ser pagos. Já para a ContaInvestimento, o saldo final é o saldo atual
acrescido de 5%, referente aos rendimentos do dinheiro investido.
Crie também duas checked exceptions: ValorInvalidoException e
SaldoInsuficienteException. A exceção ValorInvalidoException deve ser lançada se o
valor utilizado nas operações de depósito, saque ou transferência for igual ou inferior a
0. Já a exceção SaldoInsuficienteException deve ser lançada se o valor de um saque ou
transferência for superior ao saldo disponível. No construtor de ValorInvalidoException
é necessário fornecer uma mensagem de erro e o valor inválido utilizado. E no construtor
de SaldoInsuficienteException é necessário fornecer uma mensagem de erro e também o
saldo disponível.
Crie uma aplicação que instancia uma conta corrente e uma conta investimento e
tenta realizar operações de depósito, saque e transferência. Faça transações corretas e
também transações que geram exceções. Quando a transação gerar exceção, faça um catch
da mesma, imprima a mensagem de erro e o valor inválido utilizado (para
ValorInvalidoException) ou o saldo disponível (para SaldoInsuficienteException).


*/

public class ListaExcecoes2Ex2 {

    public static void main(String[] args) {
        
    }
    
}
