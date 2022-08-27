package aula4.ex2;

public class Item {
    private int codigo;
    private String descrição;
    private int quantidade;
    private double preço;
    
    //Construtor
    public Item(){
        this.codigo = 0;
        this.descrição = "";
        this.quantidade = 0; 
        this.preço = 0;
    }
    
    //Sobrecarga do construtor
    public Item(int codigo, String descrição, int quantidade, double preço){
        this.codigo = codigo;
        this.descrição = descrição;
        this.quantidade = quantidade; 
        this.preço = preço;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade > 0)
        {
            this.quantidade = quantidade;
        }
        else 
        {
           this.quantidade = 0;  
        }
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        if (preço > 0)
        {
            this.preço = preço;
        }
        else 
        {
           this.preço = 0;  
        }
    }
    
    public void getTotal(int quantidade, double preço){
        double total = quantidade*preço;
        System.out.println("A fatura do item é: " + total);
    }
    
    
}
