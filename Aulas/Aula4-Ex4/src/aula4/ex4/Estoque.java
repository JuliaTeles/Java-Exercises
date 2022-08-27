package aula4.ex4;

public class Estoque {
    private String nome;
    private int qtdAtual;
    private int qtdMinima;
    private int qtd;

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    
    public Estoque()
    {
        
    }
    
    public Estoque(String nome, int qtdAtual, int qtdMinima)
    {
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAtual() {
        if (qtdAtual<0)
        {
            qtdAtual = 0;
        }
        else
        {
            qtdAtual = qtdAtual;
        }
        
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public int getQtdMinima() {
        if (qtdMinima<0)
        {
            qtdMinima = 0;
        }
        else
        {
            qtdMinima = qtdMinima;
        }
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }
    
    public void repor(int qtd)
    {
        qtdAtual = qtdAtual + qtd;
        if (qtdAtual<0)
        {
            qtdAtual = 0;
        }
        else
        {
            qtdAtual = qtdAtual;
        }

    }
    
    public void darBaixa (int qtd)
    {
        qtdAtual = qtdAtual - qtd;
        
        if (qtdAtual<0)
        {
            qtdAtual = 0;
        }
        else
        {
            qtdAtual = qtdAtual;
        }
 
    }
    
    public void mostra(String nome, int qtdAtual, int qtdMinima)
    {
        System.out.println("O produto " + nome + " possui " + qtdAtual + " em estoque e " + qtdMinima + " de quantidade mínima.");
    }
    
    public void precisaRepor(int qtdAtual, int qtdMinima){
        boolean repor; 
        if (qtdAtual <= qtdMinima)
        {
            repor = true;
            System.out.println("Precisa repor o estoque, repor = " + repor);
        }
        else{
            repor = false;
            System.out.println("Não precisa repor o estoque, repor = " + repor);
        }
    }
    
}
