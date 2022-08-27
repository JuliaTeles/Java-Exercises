
package aula10.ex2;

public class Trapezio extends Quadrilatero {
    private double baseMaior;

    public Trapezio(double baseMaior, double base, double altura) {
        super(base, altura);
        this.baseMaior = baseMaior;
    }
    
    
    @Override
    @SuppressWarnings("empty-statement")
    public double calcArea()
    {
        area = ((base+baseMaior)*altura)/2;;
        return area;
    }
    
    public double getBaseMaior() {
        return baseMaior;
    }

    public void setBaseMaior(double baseMaior) {
        this.baseMaior = baseMaior;
    }
    
    
}
