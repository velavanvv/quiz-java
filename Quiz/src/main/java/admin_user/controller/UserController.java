package admin_user.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import admin_user.dto.UserDto;
import admin_user.model.ApiResponseEntity;
import admin_user.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserDetailsService userDetailsService;
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping("/registration")
	public String getRegistrationPage() {
		return "register";
	}

	
	@PostMapping("/registration")
	public ResponseEntity<ApiResponseEntity> saveUser(@RequestBody UserDto userDto, Model model) {
		boolean ischeck=userService.save(userDto);
	
	if(ischeck){	
	return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(new ApiResponseEntity(true)); }
else{
	/* model.addAttribute("message", "user alredy exits!");  */
return ResponseEntity.ok()
.contentType(MediaType.APPLICATION_JSON)
.body(new ApiResponseEntity(false));
}

	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("user/page")
	public String userPage (Model model, Principal principal) {
		UserDetails userDetails = userDetailsService.loadUserByUsername(principal.getName());
		model.addAttribute("user", userDetails);
		return "user";
	}
	
	@GetMapping("admin/page")
	public String adminPage (Model model, Principal principal) {
		UserDetails userDetails = userDetailsService.loadUserByUsername(principal.getName());
		model.addAttribute("user", userDetails);
		return "admin";
	}

}
