package admin_user.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class QuestionEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("questionNo")
    private int questionNo;
    
    public QuestionEntity(int questionNo, String question, String option1, String option2, String option3,String answer) {
        this.questionNo = questionNo;
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.answer=answer;
    }
    public QuestionEntity(String question, String option1, String option2, String option3, String answer) {
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.answer=answer;
    }

    @JsonProperty("question")
    private String question;
    
    @JsonProperty("option1")
    private String option1;

    @JsonProperty("answer")
    private String answer;
   
    public QuestionEntity() {
    }
    @Override
    public String toString() {
        return "QuestionEntity [questionNo=" + questionNo + ", question=" + question + ", option1=" + option1
                + ", answer=" + answer + ", option2=" + option2 + ", option3=" + option3 + "]";
    }
    public String getAnswer() {
        return answer;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    public int getQuestionNo() {
        return questionNo;
    }
    public void setQuestionNo(int questionNo) {
        this.questionNo = questionNo;
    }
    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public String getOption1() {
        return option1;
    }
    public void setOption1(String option1) {
        this.option1 = option1;
    }
    public String getOption2() {
        return option2;
    }
    public void setOption2(String option2) {
        this.option2 = option2;
    }
    public String getOption3() {
        return option3;
    }
    public void setOption3(String option3) {
        this.option3 = option3;
    }
    @JsonProperty("option2")
    private String option2;

    @JsonProperty("option3")
    private String option3;


}
 