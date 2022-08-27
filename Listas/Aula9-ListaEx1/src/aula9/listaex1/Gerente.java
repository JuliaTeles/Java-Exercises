package aula9.listaex1;

public class Gerente extends Funcionario{
    private String nomeUsuario;
    private String senha;

    public Gerente(String nome, String senha, String nomeUsuario, double salario) {
        super(nome, salario);
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.bonificacao = (this.salario*20)/100; 
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Nome de Usuário: " + this.nomeUsuario);
        System.out.println("Senha: " + this.senha);
    }
    
    
}
