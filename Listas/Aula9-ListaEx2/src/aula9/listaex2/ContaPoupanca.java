package aula9.listaex2;

public class ContaPoupanca extends ContaBancaria{
    private int diaRendimento;

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public ContaPoupanca(int diaRendimento, String cliente, int numConta, double saldo) {
        super(cliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }
    
    public void calcularNovoSaldo(){
        saldo = saldo + diaRendimento;
        System.out.println("Saldo na conta: " + saldo);
    }
}
