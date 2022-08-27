package aula10.ex1;

public class Revista extends Produto{
    private String mes;
    private int ano;

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    @Override
    public void mostra(){
        System.out.println("É uma revista");
    }
}
