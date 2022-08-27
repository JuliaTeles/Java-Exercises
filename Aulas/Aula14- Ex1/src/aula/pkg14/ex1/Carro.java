package aula.pkg14.ex1;

public class Carro implements Automovel, VeiculoTerrestre {

    @Override
    public void acelerar() {
        System.out.println("vrummmmmmmmmm 200km/h");
    }

    @Override
    public void frear() {
        System.out.println("rrrrrrrrryyyy freando carro");
    }

    @Override
    public void ligar() {
        System.out.println("bip bip ligando carro");
    }
    
    
}
