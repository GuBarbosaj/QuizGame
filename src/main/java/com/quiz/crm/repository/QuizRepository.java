package com.quiz.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quiz.crm.model.Question;

@Repository
public interface QuizRepository extends JpaRepository<Question, Long>{

}
