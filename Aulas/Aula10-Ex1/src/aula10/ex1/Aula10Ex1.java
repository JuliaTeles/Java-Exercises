package aula10.ex1;

/*
    Nome: Júlia Téles Cruz      05/04/22        3°INFD
    Aula 10, exemplo 1
    Treino de polimorfismo
*/

public class Aula10Ex1 {

    public static void main(String[] args) {
        Produto p = new Livro();
        p.mostra();
                
        Produto p2 = new Revista();
        p2.mostra();
      
        Livro l = new Livro();
        //Produto p3 = (Produto)l; // cast
        l.mostra();
        
        l.setEditora("Rocco");
        
        if (p2 instanceof Produto){
            System.out.println("É instância");
        } else{
            System.out.println("Não é instância");
        }
         
       
    }
}

