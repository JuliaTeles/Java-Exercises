package model;

/*

    Nome: Júlia Téles Cruz          RA: 200558
    Inicio: 10.05  Termino: 11.05       3ºINFD

 */
public class Livro {
    private String nome;
    private int paginas;
    private String autor;

    public Livro(String nome, String autor, int paginas) {
        this.nome = nome;
        this.autor = autor;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    
    
    
}
