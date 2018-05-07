package com.example.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerThymeleaft {

		@RequestMapping("/")
		public String welcome(Model model) {
			//model.put("message", this.message);
			return "index";
		}
		
		@RequestMapping("/about")
		public String about(Model model) {
			//model.put("message", this.message);
			return "about";
		}

}
