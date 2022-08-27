package aula6.ex1;

public class Poupança {
   private static float taxaJurosAnual=0; 

    public static float getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public static void setTaxaJurosAnual(float aTaxaJurosAnual) {
        taxaJurosAnual = aTaxaJurosAnual;
    }
   private float saldo; 
   
   public void calcularJurosMensais(float taxajurosAnual, float saldo){
       float x = 0;

       x = (saldo*taxajurosAnual)/12;
       saldo = saldo + x;
       System.out.println(saldo);
   }
   
   public static void modificaTaxaJuro(float taxaJurosAnual){
       taxaJurosAnual = taxaJurosAnual/100;

       
   }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Poupança(float saldo){
        saldo = saldo;
    }
   
    public Poupança(){
        saldo = saldo;
 
    }
   
   
   
   
   
   
}
