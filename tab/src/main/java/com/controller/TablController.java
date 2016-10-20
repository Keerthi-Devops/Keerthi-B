package com.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class TablController
{
	String message = "Welcome to Spring MVC!";
	 
		@RequestMapping("/lan")
		public ModelAndView showMessage(
				@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
			System.out.println("in controller");
	 
			ModelAndView mv = new ModelAndView("lan");
			mv.addObject("message", message);
			mv.addObject("name", name);
			return mv;
		}
	}

