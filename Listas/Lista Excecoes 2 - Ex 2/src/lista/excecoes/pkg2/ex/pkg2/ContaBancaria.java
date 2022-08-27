
package lista.excecoes.pkg2.ex.pkg2;


public abstract class ContaBancaria {
    protected double saldo; 
    
    public void sacar(double s){
        saldo = saldo - s;
        System.out.println("-------------------");
        System.out.println("Saque concluido!");
        System.out.println("O saldo é: " + saldo);
    }
    public void depositar(double d){
        saldo = saldo + d;
        System.out.println("-------------------");
        System.out.println("Deposito concluido!");
        System.out.println("O saldo é: " + saldo);
    }
    public void transferir(double t, ContaBancaria c){
        saldo = c.getSaldo();
        saldo = saldo + t;
        System.out.println("-------------------");
        System.out.println("Transferencia concluida!");
        System.out.println("O saldo da conta é: " + saldo);
        
    }
    
    public void calcularSaldo(){
        System.out.println("-------------------");
        System.out.println("O saldo é: " + saldo);
    }

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
