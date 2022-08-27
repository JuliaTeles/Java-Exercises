package aula8.ex1;

public class Monitor extends Aluno{
    private double bolsa;

    public Monitor(double bolsa, int ra, String nome, int idade) {
        super(ra, nome, idade);
        this.bolsa = bolsa;
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }
}
