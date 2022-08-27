/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Atleta;

/**
 *
 * @author aluno
 */
public class AtletaController {
    private ArrayList<Atleta> lista;
    

    public AtletaController() {
        lista = new ArrayList();
    }

    
    public void cadastrar(int codigo, String nome, double peso, int idade, double altura){
        Atleta al = new Atleta(codigo, nome, peso, idade, altura);
        lista.add(al);
        
    }
    
    public void media(double peso, double mediaAtl, int n){
        for (Atleta a : lista){
           mediaAtl = mediaAtl + a.getPeso();
           n++;
        }
        mediaAtl = mediaAtl/n;
        JOptionPane.showMessageDialog(null, "A media do peso dos jogadores é de " + mediaAtl);
    }
    
    public void maisAlto(double altura, String nome){
        altura = 0;
        for (Atleta a : lista){
           if(altura<a.getAltura()){
               altura = a.getAltura(); 
               nome = a.getNome(); 
           }
           else{
               altura = altura;
           }
        }
        JOptionPane.showMessageDialog(null, "O atleta mais alto é o " + nome + " com " + altura + "m de altura");
    }
    public void menorIdade(int idade, String nome){
        int n = 0;
        int m = 0;
        for (Atleta a : lista){
           idade = a.getIdade();
           if(idade>18){
              n++; 
           }
           else{
              m++;
           }
        }
        JOptionPane.showMessageDialog(null, "Há " + n + " atleta(s) maior(es) de idade e " + m + " atleta(s) menor(es) de idade.");
    }

    public ArrayList<Atleta> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Atleta> lista) {
        this.lista = lista;
    }
    
    public void excluir(String nomeExcluir){
        
        for (Atleta a: lista){
            String nome = a.getNome();
            if(nome.equals(nomeExcluir)){
                lista.remove(a);
                break;
            }
        }
    
    }
    
}
