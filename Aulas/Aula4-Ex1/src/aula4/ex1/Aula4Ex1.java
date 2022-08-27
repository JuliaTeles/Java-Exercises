package aula4.ex1;

//Júlia Téeles Cruz     RA:200558       3°INFD

/*
Exercício 1:
Crie uma classe chamada Funcionário que inclua 3 atributos: nome, sobrenome,
salário mensal. Sua classe deve ter um construtor que inicialize esses 3 atributos
com valores vazios e zeros. Também deve ter a sobrecarga do construtor, que
recebe esses 3 atributos como argumento. Forneça métodos get e set para todos
os atributos. Se o salário mensal não for positivo, configure-o como zero. Escreva
um programa que demonstre as capacidades da classe Funcionário. Crie dois
objetos do tipo Funcionário e exiba o salário ANUAL de cada objeto. Dê a cada
funcionário um aumento de 10% e exiba novamente o salário anual de cada um
deles.
*/

public class Aula4Ex1 {

    public static void main(String[] args) {
        Funcionario aldemar = new Funcionario("Aldemar", "Silva", 1400);
        Funcionario josiane = new Funcionario("Josiane", "Sousa", 2500);
        System.out.println("O funcionário " + aldemar.getNome()+ " " + aldemar.getSobrenome()+" recebe de sálario mensal " + aldemar.getSalarioMensal());
        System.out.println("O funcionário " + josiane.getNome()+ " " + josiane.getSobrenome()+" recebe de sálario mensal " + josiane.getSalarioMensal());
        aldemar.anual(aldemar.getSalarioMensal());
        josiane.anual(josiane.getSalarioMensal());
        
        
        josiane.aumento(josiane.getSalarioMensal(), josiane.getAnual());
        System.out.println("O funcionário " + aldemar.getNome()+ " " + aldemar.getSobrenome()+" recebe de sálario anual " + aldemar.getAnual());
      
        
    }
    
}
