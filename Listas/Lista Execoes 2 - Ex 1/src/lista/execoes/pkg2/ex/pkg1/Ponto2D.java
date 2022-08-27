
package lista.execoes.pkg2.ex.pkg1;

public class Ponto2D {
    private double x;
    private double y;

    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }
    
    @Override
    public String toString(){
        System.out.println("-------------------");
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
        
        return x + "" + y;
    }
}
