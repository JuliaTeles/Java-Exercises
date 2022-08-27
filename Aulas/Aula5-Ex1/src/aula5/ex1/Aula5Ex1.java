package aula5.ex1;

public class Aula5Ex1 {
    public static void main(String[] args) {
        
        String legal = new String("Indaiatuba");
        String chato = new String("Atibaia");
        
        System.out.println(legal.charAt(3));
        System.out.println(legal.toUpperCase());
        System.out.println(legal.endsWith("a"));
        
        if (legal.equals(chato))
        {
            System.out.println("É igual");
        }
        else
        {
            System.out.println("É diferente");
        }
        
        System.out.println(legal.equalsIgnoreCase(chato));
    }
    
}
