/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author taniabasso
 */
@Entity
@Table (name = "DiscHib")
public class Disciplina {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private int id;
    
    @Column
    private String nomeDisc;
    
    @Column(nullable = false, length = 100)
    private String descricao;
    
    @Column
    private int horaria;
    

    public Disciplina(String nomeDisc, String descircao, int horaria) {
        this.nomeDisc = nomeDisc;
        this.descricao = descricao;
        this.horaria = horaria;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeDisc() {
        return nomeDisc;
    }

    public void setNomeDisc(String nomeDisc) {
        this.nomeDisc = nomeDisc;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getHoraria() {
        return horaria;
    }

    public void setHoraria(int horaria) {
        this.horaria = horaria;
    }
    
    
    
}
