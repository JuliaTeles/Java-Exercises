package aula11.ex2;

import java.util.ArrayList;

/*
    Nome: Júlia Téles Cruz      05/04/22        3°INFD
    Aula 10, exemplo 1
    Treino de polimorfismo
*/

public class Aula10Ex1 {

    public static void main(String[] args) {
       Livro liv1 = new Livro();
       liv1.setCodigo(1234);
       liv1.setNome("Engenheiros do caos");
       liv1.setEditora("Rocco");
       
       Revista r1 = new Revista();
       r1.setNome("Veja");
       r1.setCodigo(456);
       r1.setMes("Abril");
       r1.setAno(2022);
      
       ArrayList <Produto> lista = new ArrayList();
       lista.add(r1);
       lista.add(liv1);
       
       for (Produto p: lista){
           p.mostra();
           if(p instanceof Revista){
               Revista r = (Revista)p;
               System.out.println(r.getMes() + " " + r.getAno());
           } else if(p instanceof Livro){
               Livro r = (Livro)p;
               System.out.println(r.getEditora());
           } 
           
       }
    }
}

