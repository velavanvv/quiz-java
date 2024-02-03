package com.application.quiz.QuizController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.application.quiz.QuizEntity.QuizEntity;
import com.application.quiz.QuizService.QuizService;

@Controller
public class LoginController {        
@Autowired
QuizService quizService;
 

@GetMapping("/login")
public String home(){
return "Login";
}



@PostMapping("/addingAdmin")
public String saveAdmin(@ModelAttribute QuizEntity addPirate ){
    quizService.add(addPirate);
return "redirect:/home";
} 

@GetMapping("/home")
public String getAll(Model model){
    List<QuizEntity> user=quizService.getAllUser();
    model.addAttribute("users", user);
    return "Home";
}



}
