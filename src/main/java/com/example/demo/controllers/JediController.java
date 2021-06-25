package com.example.demo.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Jedi;

@Controller
public class JediController {

	@GetMapping("/jedi")
	public ModelAndView jedi() {
		
		final ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("jedi");
		
		final Jedi luke = new Jedi("Luke", "Skywlker");
		modelAndView.addObject("allJedi", List.of(luke));
		
		return modelAndView;
	}
	
	
	
}
