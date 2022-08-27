package aula11.ex1;

/*
    Nome: Júlia Téles Cruz      06/04/22        3°INFD
    Aula 11, exemplo 1
    Polimorfismo:
    Crie uma hieraquia de classes conforme abaixo com os seguintes atributos e comportamentos,
    utilize os seus conhecimentos e distribua as características de forma que tudo o que for em 
    comum a todos os animais fique na classe Animal. Implemente um programa que invoque os 
    métodos e emita o som de cad um de forma polimórfica. 
*/

public class Aula11Ex1 {

    public static void main(String[] args) {
        Animal a1 = new Cachorro("Marleu", 7);  
        
        Animal a2 = new Cavalo("Estrela", 2);
        
        Animal a3 = new Preguica("Cotinha", 1);
        
        Animal a4 = new Animal("Birineu", 8);
        
        a1.som();
        a2.som();
        a3.som();
        a4.som();
        
        a1.acao();
        a2.acao();
        a3.acao();
        a4.acao();
           
    }
    
}
