
package lista.excecoes.ex.pkg2;

public class Retangulo implements AreaCalculavel{
    private double baseMenor;
    private double baseMaior;

    public Retangulo(double baseMenor, double baseMaior) {
        
        if(baseMenor<=0 | baseMaior<=0){
            throw new IllegalArgumentException("Valor inválido, o valor esperado é maior que 0 (zero)");
        }
        else if (baseMenor == baseMaior){
            throw new IllegalArgumentException("Valor inválido, modifique um dos valores a fim de torna-los diferentes");
        }else{
            this.baseMenor = baseMenor;
            this.baseMaior = baseMaior;
        }
    }
    
    @Override
    public void calcularArea() {
        System.out.println("A area do retangulo é " + baseMaior*baseMenor);
    }

    public double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }

    public double getBaseMaior() {
        return baseMaior;
    }

    public void setBaseMaior(double baseMaior) {
        this.baseMaior = baseMaior;
    }
    
}
