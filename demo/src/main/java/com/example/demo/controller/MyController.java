package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.example.demo.input.UserInputDTO;
import com.example.demo.model.User;
import com.example.demo.output.OutputDTO;
import com.example.demo.service.MyService;
//import org.springframework.web.bind.annotation.RestController;

@Controller
public class MyController {
	
	@Autowired
	private MyService service;
	
	

	@GetMapping("/addUser")
    public String showForm(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        //System.out.println("sashika");
        return "addUser";
        
	}
	
	/*@GetMapping("/addUserr")
	public @ResponseBody String show()
	{
		return "addUser";
	}*/
	
	
//	@PostMapping("/test")
//	public ResponseEntity<OutputDTO> saveUser(@RequestBody UserInputDTO user)
//	{
//		return new ResponseEntity<>(service.saveUser(user),HttpStatus.CREATED);
//	}
	
	//@PostMapping("/doctors")
	@PostMapping(value = "/test2", produces = { MediaType.APPLICATION_JSON_VALUE })
	public @ResponseBody ResponseEntity<OutputDTO> saveUser(@RequestBody UserInputDTO userInput) {
		OutputDTO output = service.saveUser(userInput);
		ResponseEntity<OutputDTO> outputDTO = new ResponseEntity<OutputDTO>(output, HttpStatus.CREATED);
		return outputDTO;

	}

}
