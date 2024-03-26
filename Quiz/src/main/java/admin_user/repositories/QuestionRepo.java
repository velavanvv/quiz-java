package admin_user.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import admin_user.model.QuestionEntity;



@Component
public interface QuestionRepo extends CrudRepository<QuestionEntity,Integer> {
    public QuestionEntity findByQuestionNo(int questionNo);
} 