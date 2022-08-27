package aula.pkg14.exercicio.pkg1;

import java.util.ArrayList;

/*
    
    Aula 14 - Lista parte 5 - Exercício 1
    
    Implemente as classes conforme o diagrama abaixo. O vencimento para o Assalariado,
Comissionado e Horista deve ser calculado de acordo com o salário, taxa de comissão e horas
trabalhadas, respectivamente.
    Depois de implementar as classes, implemente, no método main(), uma lista do tipo ArrayList e
adicione nessa lista ao menos dois empregados assalariados, dois comissionados e dois
horistas. Supondo que o dono da empresa quer saber o valor total das vendas realizadas pelos
empregados cadastrado nessa lista, implemente o código para atende-lo.

 */
public class Aula14Exercicio1 {


    public static void main(String[] args) {
       
       Empregado a = new Assalariado(1500, "Denise", "Palmeiras", "444");
       Empregado b = new Assalariado(1500, "Humberto", "Parana", "778");
       
       Empregado c = new Comissionado(200, 0.5, "Gilberto", "Carvalho", "733");
       Empregado d = new Comissionado(140, 0.4, "René", "Souza", "467");
       
       Empregado e = new Horista(100, 6, "Gabriel", "Fernandes", "577");
       Empregado f = new Horista(60, 8, "Silvia", "Santos", "990");
      
       ArrayList <Empregado> lista = new ArrayList();
       lista.add(a);
       lista.add(b);
       lista.add(c);
       lista.add(d);
       lista.add(e);
       lista.add(f);
       
       for (Empregado p: lista){
           
           if(p instanceof Comissionado){
               Comissionado r = (Comissionado)p;
               System.out.println("O empregado " + r.getNome() + " " + r.getSobrenome() + " fez um total de " + r.getTotalVenda() + " vendas");
           } else{
               System.out.println("O empregado " + p.getNome() + " " + p.getSobrenome() + " não é um comissionado");
           } 
           
       }
    }
    
}
