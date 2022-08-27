package aula8.ex1;

public class Pessoa {
   private String nome;
   private int idade;
   protected double altura;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
   
   // Get & set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
