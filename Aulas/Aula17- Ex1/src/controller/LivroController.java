
package controller;

import java.util.ArrayList;
import model.Livro;

/**
 *
 * @author aluno
 */
public class LivroController {
    
    private ArrayList<Livro> lista;
    

    public LivroController() {
        lista = new ArrayList();
    }

    
    public void cadastrar(String nome, String autor, int paginas){
        Livro lv = new Livro(nome, autor, paginas);
        lista.add(lv);
        
    }

    public ArrayList<Livro> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Livro> lista) {
        this.lista = lista;
    }
    
    
}
