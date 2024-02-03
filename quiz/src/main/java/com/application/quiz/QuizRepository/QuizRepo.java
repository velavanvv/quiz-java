package com.application.quiz.QuizRepository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.application.quiz.QuizEntity.QuizEntity;

@Component
@Repository
public interface QuizRepo extends CrudRepository<QuizEntity,Integer> {

    public QuizEntity findByUserEmail(String email);
    
    
} 
