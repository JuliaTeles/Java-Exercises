package aula11.ex1;

public class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }
    
    @Override
    public void som(){
        System.out.println("Au");
    }
    
    @Override
    public void acao(){
        System.out.println("O cachorro corre");
    }
}
