
package lista.execoes.pkg2.ex.pkg1;

public class Ponto3D extends Ponto2D{
    private double z;

    public Ponto3D(double z, double x, double y) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    
    @Override
    public String toString(){
        super.toString();
        System.out.println("Z: " + z);
        return z + "";
    }
    
}
