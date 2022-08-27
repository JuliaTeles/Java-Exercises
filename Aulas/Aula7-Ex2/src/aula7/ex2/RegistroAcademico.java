package aula7.ex2;

/*
Nome: Júlia Téles Cruz      RA:200558       3°INFD

Exercício 3:
Crie uma classe chamada RegistroAcademico que tenha os atributos nome, numeroMatricula,
codigoCurso e percentualCobranca. O atributo numeroMatrícula deve ser declarado como static, e o
valor desse campo deve ser incrementado cada vez que uma instância da classe for criada. Defina
os métodos get e set e construtores necessários, considerando o atributo static. Escreva também uma
aplicação que crie algumas instâncias da classe para demonstrar seu funcionamento.
*/

public class RegistroAcademico {
       private String nome;
       private static int numeroMatricula;
       private int codigoCurso;
       private double percentualCobranca;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static int getNumeroMatricula() {
        return numeroMatricula;
    }

    public static void setNumeroMatricula(int numeroMatricula) {
        RegistroAcademico.numeroMatricula = numeroMatricula;
    }

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public double getPercentualCobranca() {
        return percentualCobranca;
    }

    public void setPercentualCobranca(double percentualCobranca) {
        this.percentualCobranca = percentualCobranca;
    }
       
    public RegistroAcademico(String nome, int codigoCurso, double percentualCobranca)
    {
        nome = nome;
        numeroMatricula++;
        codigoCurso = codigoCurso;
        percentualCobranca = percentualCobranca; 
        
        System.out.println("O aluno " + nome + " de matricula " + numeroMatricula + " faz o curso de código " + codigoCurso);
    }
      
} 
        