package aula8.ex1;

// Nome: Júlia Téles Cruz       RA:200558       3ºINFD
// Projeto Herança

public class Aula8Ex1 {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Matioli", 80);
        Aluno a1 = new Aluno(200456, "Garibaldo", 25);

        System.out.println(p1.getNome() + " possui " + p1.getIdade() + " anos");                         
        System.out.println(a1.getNome() + " possui " + a1.getIdade() + " anos");
        
        Professor prof1 = new Professor(20000, "Galileu", 99);

        System.out.println(prof1.getNome() + " possui " + prof1.getIdade() + " anos");
        
        Monitor moni1 = new Monitor(500, 200154, "Jesus", 2022);
        
        System.out.println(moni1.getNome() + " possui " + moni1.getIdade() + " anos, tem o ra " + moni1.getRa() + " e recebe " + moni1.getBolsa() + " de bolsa");
    }
    
}
