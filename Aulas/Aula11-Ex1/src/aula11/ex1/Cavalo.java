package aula11.ex1;

public class Cavalo extends Animal {

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }
    
    @Override
    public void som(){
        System.out.println("Ihaaaa");
    }
    
    @Override
    public void acao(){
        System.out.println("O cavalo corre");
    }
}
