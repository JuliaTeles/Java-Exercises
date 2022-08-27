package aula8.ex1;


public class Aluno extends Pessoa{
    private int ra;

    public Aluno(int ra, String nome, int idade) {
        super(nome, idade);
        this.ra = ra;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }
    
}
