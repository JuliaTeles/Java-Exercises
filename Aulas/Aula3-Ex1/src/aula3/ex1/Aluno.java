package aula3.ex1;

public class Aluno {
    private int ra;
    private String nome;
    
    //Construtor
    public Aluno(int ra, String nome)
    {
        this.ra = ra;
        this.nome = nome;
    }
    
    //Sobrecarga do construtor
    public Aluno(int ra)
    {
        this.ra = ra;
        this.nome = "";
    }
    
    //Sobrecarga do construtor
    public Aluno(String nome)
    {
        this.ra = 0;
        this.nome = nome;
    }
    
    //Getter and Setter
    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void validar(int ra){
        if(ra>0)
        {
            System.out.println("RA válido");
        }
        else
        {
            System.out.println("RA inválido");
        }
    }
    
    public void validar(String nome){
        if(nome.equals("X"))
        {
            System.out.println("Nome inválido");
        }
        else
        {
            System.out.println("Nome válido");
        }
    }
   
}
