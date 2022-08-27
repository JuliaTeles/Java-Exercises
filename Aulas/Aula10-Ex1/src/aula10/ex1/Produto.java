package aula10.ex1;

public class Produto {
    private String nome;
    private int codigo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
   
    public void mostra(){
        System.out.println("É um produto");
    }
}
