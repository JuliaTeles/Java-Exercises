/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.query.Query;
import util.HibernateUtil;


/**
 *
 * @author taniabasso
 */
public class TesteHibernate2 {
    public static void main(String[] args) {
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        session.beginTransaction();
        
        // Adicionando novos alunos 
        Aluno al1 = new Aluno(1234, "Maria");
        Aluno al2 = new Aluno(4567,"Jose");
        Aluno al3 = new Aluno(8900, "Marcelo");
        
        // Adicionando novos professores 
        Professor p1 = new Professor("Tania", "taniab@gmail.com", 20000);
        Professor p2 = new Professor("Matioli", "matioli@gmail.com", 55000);
        Professor p3 = new Professor("Matioli Fake", "matioli@gmail.com", 55000);
        
        // Adicionando novas disciplinas  
        Disciplina disc1 = new Disciplina ("LPM", "Hibernate hibernando", 50);
        Disciplina disc2 = new Disciplina ("TCC", "O famoso tcc", 100);
        Disciplina disc3 = new Disciplina ("Mobile", "kkkkksla", 1);
         
        // Salvando os dados no banco
        session.save(al1);
        session.save(al2);
        session.save(al3);
        
        session.save(p1);
        session.save(p2);
        session.save(p3);
        
        session.save (disc1);
        session.save(disc2);
        session.save(disc3);
       
        session.delete(disc3); // testando o delete 
        
        session.getTransaction().commit();
       
        //String hql = "from Aluno where nome like 'M%'";
        //String hql = "from Aluno where ra = 4567";
        String hql = "from AlunoHib where nome like 'M%' order by ra";
        Query query = session.createQuery(hql);
        
        //Percorrendo os dados dos alunos 
        ArrayList<Aluno> listaAluno = (ArrayList) query.list();
        for (Aluno a: listaAluno)
        {
            System.out.println("RA: " + a.getRa() + " | Nome: " + a.getNome());
            System.out.println("________________________");
        }
        
        //Percorrendo os dados dos professores 
        ArrayList<Professor> listaProf = (ArrsayList) query.list();
        for (Professor p: listaProf)
        {
            System.out.println("Matrícula: " + p.getMatricula()+ " | Nome: " + p.getNomeProf());
            System.out.println("E-mail: " + p.getEmailProf()+ " | Salário: " + p.getSalario());
            System.out.println("________________________");
        }
        
        
        session.close();
        HibernateUtil.shutdown();        
    }
}
