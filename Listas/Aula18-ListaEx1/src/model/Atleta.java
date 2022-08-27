/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author aluno
 */
public class Atleta {
    private int codigo;
    private String nome;
    private double peso;
    private double altura;
    private int idade;


    public Atleta(int codigo, String nome, double peso, int idade, double altura) {
        this.codigo = codigo;
        this.nome = nome;
        this.peso = peso;
        this.idade = idade;
        this.altura = altura;
    }


    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
