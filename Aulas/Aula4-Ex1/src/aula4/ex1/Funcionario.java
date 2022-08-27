package aula4.ex1;

public class Funcionario {
    private String nome;
    private String sobrenome;
    private double salarioMensal;
    private double anual;

    //Construtor
    public Funcionario(){
        this.nome = "";
        this.sobrenome = "";
        this.salarioMensal = 0; 
        this.anual = 0;
    }

    public double getAnual() {
        return anual;
    }

    public void setAnual(double anual) {
        this.anual = anual;
    }
    
    //Sobrecarga do construtor 
    public Funcionario(String nome, String sobrenome, double salarioMensal){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal; 
        this.anual = anual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        if (salarioMensal > 0)
        {
            this.salarioMensal = salarioMensal;
        }
        else 
        {
           this.salarioMensal = 0;  
        }
    }
    
    public void anual(double salarioMensal)
    {
        this.anual = salarioMensal*12;
        System.out.println("O funcionário " + getNome()+ " " + getSobrenome()+" recebe de sálario anual " + anual);
    }
    
    public void aumento(double salarioMensal, double anual)
    {
        anual = anual+(anual/10);
        System.out.println("O funcionário " + getNome()+ " " + getSobrenome()+" recebe de sálario anual com aumento " + anual);
    }
}