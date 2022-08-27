package aula9.listaex1;

public class Telefonista extends Funcionario {
    private int codigo;

    public Telefonista(int codigo, String nome, double salario) {
        super(nome, salario);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Código: " + this.codigo);
        
    }
}
