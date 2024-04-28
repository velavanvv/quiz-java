package admin_user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
/* import org.springframework.stereotype.Controller; */
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
/* 
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper; */

import admin_user.model.QuestionEntity;
import admin_user.service.QuestionService;

@RestController
public class QuestionController {
    @Autowired
    QuestionService questionService;

    @GetMapping("/user/home")
    public ModelAndView home(Model model){
List<QuestionEntity> question=questionService.getAll();

model.addAttribute("questions", question);

        return new ModelAndView("Home");
    }

    @GetMapping("/user/questions")
    public ResponseEntity<List<QuestionEntity>>  questions(){

  return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(questionService.getAll());   }

    @GetMapping("/user/{questionNo}")
    public ModelAndView checkOption(@RequestParam String selectedOption,@PathVariable("questionNo") int number,Model model){
      QuestionEntity questionEntity= questionService.checkopt(number);
      //model.addAttribute("questions", questionEntity);
      if(questionEntity.getAnswer().equals(selectedOption)){  
        model.addAttribute("Answer","correct answer");
      return new ModelAndView("Answer");}
      else{
       model.addAttribute("Answer", "Answer is wrong its correct answer is"+questionEntity.getAnswer() );
       return new ModelAndView("Answer");
      }
    }

} 