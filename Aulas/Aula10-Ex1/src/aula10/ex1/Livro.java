package aula10.ex1;

public class Livro extends Produto {
    private String editora;

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
    
    @Override
    public void mostra(){
        System.out.println("É um livro");
    }
    
}
