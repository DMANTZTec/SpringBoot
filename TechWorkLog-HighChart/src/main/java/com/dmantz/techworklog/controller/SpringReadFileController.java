package com.dmantz.techworklog.controller;



import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import com.dmantz.techworklog.model.User;
import com.dmantz.techworklog.service.SpringReadFileService;


@Controller
public class SpringReadFileController {
	
	@Autowired
	private SpringReadFileService springReadFileService;	
	
	
	@GetMapping(value="/")
	public String home(Model model) {
		
		model.addAttribute("user",new User());
		List<User> users=springReadFileService.findAll();
		model.addAttribute("users",users);
				
		return "view/users";
		
	}
	
	
	@PostMapping(value="/fileupload")	
	public String uploadFile(@ModelAttribute User user,RedirectAttributes redirectAttributes) {
		
		boolean isFlag=springReadFileService.saveDataFromUploadfile(user.getFile());
		
		if(isFlag) {
			
			redirectAttributes.addFlashAttribute("successmessage", "File Upload Successfully!");
			
		}else {
			
			redirectAttributes.addFlashAttribute("errormessage", "File Upload Not Done,Please try again");
		}		
		
		return "redirect:/";
		
	}

}
