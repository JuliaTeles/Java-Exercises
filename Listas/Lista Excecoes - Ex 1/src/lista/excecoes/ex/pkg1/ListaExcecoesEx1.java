
package lista.excecoes.ex.pkg1;

/*

Aula 15, Lista de Exceções - Exercício 1    03.05.20022
Nome: Júlia Téles Cruz      RA: 200558      3ºINFD

Imagine que a sua aplicação é composta pelo seguinte código:
Object o = null;
o.toString();
Se você executar este código irá perceber que uma exceção será lançada.
Identifique que exceção é esta e altere este mesmo código para que ele
exiba uma mensagem amigável de erro e termine normalmente.

*/

public class ListaExcecoesEx1 {

    public static void main(String[] args) {
        Object o = null;
        
        try{
          o.toString();  
        }
        catch(NullPointerException e){
            System.out.println("Não é permitido string nulo");
        }
    }
    
}
