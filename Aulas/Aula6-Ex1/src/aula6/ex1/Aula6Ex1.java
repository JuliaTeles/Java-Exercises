package aula6.ex1;

public class Aula6Ex1 {

    public static void main(String[] args) {
        Poupança poupanca1 = new Poupança(2000);
        Poupança poupanca2 = new Poupança(3000);
        
        poupanca1.setSaldo(2000);
        poupanca2.setSaldo(3000);
        
        Poupança.modificaTaxaJuro(3);
        poupanca1.calcularJurosMensais(3, poupanca1.getSaldo());
        poupanca2.calcularJurosMensais(3, poupanca2.getSaldo());
        
        Poupança.modificaTaxaJuro(4);
        poupanca1.calcularJurosMensais(4, poupanca1.getSaldo());
        poupanca2.calcularJurosMensais(4, poupanca2.getSaldo());
        
        
    }
    
}
