package model;


public class Floricultura {
    private float valor;
    private String produto;
    private String descricao;

    public Floricultura(float valor, String produto, String descricao) {
        this.valor = valor;
        this.produto = produto;
        this.descricao = descricao;
    }

   

    public float getValor(){
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
