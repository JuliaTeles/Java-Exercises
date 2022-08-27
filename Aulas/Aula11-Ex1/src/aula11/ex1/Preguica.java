package aula11.ex1;

public class Preguica extends Animal {

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }
    
    @Override
    public void som(){
        System.out.println("Aaaa *devagar*");
    }
    
    @Override
    public void acao(){
        System.out.println("A preguiça sobe em árvores");
    }
}
