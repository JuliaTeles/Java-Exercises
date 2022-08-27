package aula11.ex1;

public class Animal {
    private String nome;
    private int idade;

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


    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        
    }
    
    public void som(){
        System.out.println("Grrr");
    }
    
    public void acao(){
        System.out.println("O animal apenas vive");
    }
    
}
