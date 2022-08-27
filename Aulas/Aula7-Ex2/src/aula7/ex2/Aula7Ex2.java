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

public class Aula7Ex2 {

    public static void main(String[] args) {
        RegistroAcademico josimara = new RegistroAcademico("Josimara", 200685, 0.3);
        RegistroAcademico tales = new RegistroAcademico("Tales", 200382, 0.3);
        RegistroAcademico ribamar = new RegistroAcademico("Ribamar", 200138, 0.3);
    }
    
}
