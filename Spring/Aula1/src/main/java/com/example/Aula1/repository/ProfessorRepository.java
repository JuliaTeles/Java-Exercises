package com.example.Aula1.repository;
import com.example.Aula1.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository <Professor, Integer> {

}