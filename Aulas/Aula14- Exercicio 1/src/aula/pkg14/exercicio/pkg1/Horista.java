package aula.pkg14.exercicio.pkg1;

public class Horista extends Empregado {
   private double precoHora;
   private double horasTrabalhadas;

    public Horista(double precoHora, double horasTrabalhadas, String nome, String sobrenome, String cpf) {
        super(nome, sobrenome, cpf);
        this.precoHora = precoHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }
   
    @Override
    public double vencimento() {
       precoHora = precoHora * horasTrabalhadas;
       return precoHora;
       
    }

    public double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

}
