
package control;

import java.util.ArrayList;
import model.Aluno;

/**
 *
 * @author aluno
 */
public class AlunoController {
    
    private ArrayList<Aluno> lista;
    

    public AlunoController() {
        lista = new ArrayList();
    }

    
    public void cadastrar(String nome, int idade){
        Aluno al = new Aluno(nome, idade);
        lista.add(al);
        
    }

    public ArrayList<Aluno> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Aluno> lista) {
        this.lista = lista;
    }
    
    public void excluir(String nomeExcluir){
        
        for (Aluno a: lista){
            if(a.getNome().equals(nomeExcluir)){
                lista.remove(a);
                break;
            }
        }
    
    }
}
