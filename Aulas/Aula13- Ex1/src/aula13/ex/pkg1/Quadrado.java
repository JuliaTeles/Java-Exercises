package aula13.ex.pkg1;

public class Quadrado extends Forma {

    private double lado;
    
    @Override
    public void calcularArea() {
        setArea(lado*lado);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    

    
}
