package aula9.listaex3;

public class Aula9ListaEx3 {

    public static void main(String[] args) {
        Imovel casa = new Imovel(51, "Rua Joá", 2000);
        Novo apartamento = new Novo(51, "Rua Joá", 2000);
        Usado chale = new Usado(51, "Rua Joá", 2000);
        
        casa.Acessar();
        System.out.println("--------");
        apartamento.Acessar();
        System.out.println("--------");
        chale.Acessar();
        
        
    }
    
}
