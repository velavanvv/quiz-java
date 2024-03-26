package admin_user.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import admin_user.model.QuestionEntity;
import admin_user.repositories.QuestionRepo;




@Component
public class QuestionService {
    @Autowired
    QuestionRepo questionRepo;

    public List<QuestionEntity> getAll() {
      List<QuestionEntity> questions=(List<QuestionEntity>) questionRepo.findAll();
return questions;
    }

    public QuestionEntity checkopt(int questionNo) {
       QuestionEntity questionEntity=questionRepo.findByQuestionNo(questionNo);
       return questionEntity;

    }



} 