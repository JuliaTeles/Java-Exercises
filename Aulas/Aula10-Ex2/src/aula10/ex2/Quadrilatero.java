
package aula10.ex2;

public class Quadrilatero {
    protected double base;
    protected double altura;
    protected double area;

    public Quadrilatero(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    
    public double calcArea()
    {
        area = base*altura;
        return area;
    }
    
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
