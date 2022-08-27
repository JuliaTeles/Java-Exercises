package aula9.listaex1;

public class Funcionario {
    private String nome;
    double salario;
    double bonificacao;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        this.bonificacao = (this.salario*10)/100; 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    public void mostrar(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Salario: " + this.salario);
        System.out.println("Bonificação: " + this.bonificacao);
        
    }
    
    
}
