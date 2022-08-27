
package lista.excecoes.pkg2.ex.pkg2;

/**
 *
 * @author aluno
 */
public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public void calcularSaldo() {
        saldo = saldo - (saldo * (10/100));
        System.out.println("-------------------");
        System.out.println("O saldo é: " + saldo);
    }
    
    
}
