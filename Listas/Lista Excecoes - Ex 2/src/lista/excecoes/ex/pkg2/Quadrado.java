
package lista.excecoes.ex.pkg2;

public class Quadrado implements AreaCalculavel{
    private double lado;

    public Quadrado(double lado) {
        if(lado<=0){
            throw new IllegalArgumentException("Valor inválido, o valor esperado é maior que 0 (zero)");
        }
        else{
            this.lado = lado;
        }
    }
    
    @Override
    public void calcularArea() {
        System.out.println("A area do quadrado é " + lado*lado);
        
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
}
