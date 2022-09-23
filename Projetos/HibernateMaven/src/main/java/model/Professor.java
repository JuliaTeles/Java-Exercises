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
@Table (name = "ProfessorHib")
public class Professor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private int matricula;
    
    @Column
    private String nomeProf;
    
    @Column(unique = true)
    private String emailProf;
    
    @Column
    private float salario;
    

    public Professor(String nomeProf, String emailProf, float salario) {
        this.nomeProf = nomeProf;
        this.emailProf = emailProf;
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNomeProf() {
        return nomeProf;
    }

    public void setNomeProf(String nomeProf) {
        this.nomeProf = nomeProf;
    }

    public String getEmailProf() {
        return emailProf;
    }

    public void setEmailProf(String emailProf) {
        this.emailProf = emailProf;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
}

    
