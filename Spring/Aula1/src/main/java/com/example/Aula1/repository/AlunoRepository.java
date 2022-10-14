package com.example.Aula1.repository;

import com.example.Aula1.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository <Aluno, Integer> {

}
