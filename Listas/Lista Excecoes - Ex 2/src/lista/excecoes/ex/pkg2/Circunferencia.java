package lista.excecoes.ex.pkg2;

public class Circunferencia implements AreaCalculavel {
    private double raio;

    public Circunferencia(double raio) {
        this.raio = raio;
    }
    
    
    @Override
    public void calcularArea() {
        System.out.println("A area da circunferência é " + 3.14*raio*raio);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
}
