package admin_user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import admin_user.model.QuestionEntity;
import admin_user.service.QuestionService;

@Controller
public class QuestionController {
    @Autowired
    QuestionService questionService;

    @GetMapping("/user/home")
    public String home(Model model){
List<QuestionEntity> question=questionService.getAll();
model.addAttribute("questions", question);
        return "Home";
    }
   

    @GetMapping("/user/{questionNo}")
    public String checkOption(@RequestParam String selectedOption,@PathVariable("questionNo") int number,Model model){
      QuestionEntity questionEntity= questionService.checkopt(number);
      //model.addAttribute("questions", questionEntity);
      if(questionEntity.getAnswer().equals(selectedOption)){  
        model.addAttribute("Answer","correct answer");
      return "Answer";}
      else{
       model.addAttribute("Answer", "Answer is wrong its correct answer is"+questionEntity.getAnswer() );
       return "Answer";
      }
    }

} 