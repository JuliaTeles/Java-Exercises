package aula9.listaex1;

public class Secretaria extends Funcionario {
    private int ramal;

    public Secretaria(int ramal, String nome, double salario) {
        super(nome, salario);
        this.ramal = ramal;
    }

    
    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }
    
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Ramal: " + this.ramal);
    }
}
