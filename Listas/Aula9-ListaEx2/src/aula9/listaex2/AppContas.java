package aula9.listaex2;


public class AppContas{
    
    public static void main() {
        ContaBancaria julia = new ContaBancaria("Júlia", 200558, 500);

        ContaPoupanca josefa = new ContaPoupanca(2,"Josefa", 200235, 1400);

        ContaEspecial jirafares = new ContaEspecial(6000, "Jirafares", 200276, 5000);
        
        julia.Mostrar();
        julia.Sacar();
        julia.Depositar();
        System.out.println("----------");
        josefa.Mostrar();
        josefa.Sacar();
        josefa.Depositar();
        System.out.println("----------");
        jirafares.Mostrar();
        jirafares.Sacar();
        jirafares.Depositar();
    }

}


