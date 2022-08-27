package aula3.ex1;

public class Aula3Ex1 {


    public static void main(String[] args) {
        // Aluno garibaldo = new Aluno(); Construtor default
        Aluno josimara = new Aluno(200387, "Josimara");
        System.out.println("RA: " + josimara.getRa());
        System.out.println("Nome: " + josimara.getNome());
        
        Aluno tadeu = new Aluno("Tadeu");
        System.out.println("RA: " + tadeu.getRa());
        System.out.println("Nome: " + tadeu.getNome());
        
        Aluno josefa = new Aluno(200487);
        System.out.println("RA: " + josefa.getRa());
        System.out.println("Nome: " + josefa.getNome());
        josefa.validar(200487);
        josefa.validar(josefa.getNome());
    }
    
}
