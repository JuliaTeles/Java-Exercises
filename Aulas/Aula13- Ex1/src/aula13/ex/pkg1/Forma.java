package aula13.ex.pkg1;

public abstract class Forma {
    private double area; 

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    public abstract void calcularArea(); 
    
    
}
