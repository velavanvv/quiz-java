package com.application.quiz.QuizService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.application.quiz.QuizEntity.QuizEntity;
import com.application.quiz.QuizRepository.QuizRepo;

@Component
public class QuizService {
@Autowired
QuizRepo quizRepo;

    
    public void add(QuizEntity quizEntity) {
      quizRepo.save(quizEntity);
    }

    public QuizEntity getByName(String str){
      QuizEntity finded=quizRepo.findByUserEmail(str);
      return finded;
    }

     public List<QuizEntity> getAllUser() {
    List<QuizEntity>user=(List<QuizEntity>)quizRepo.findAll();  
    return user;
    
}
}
