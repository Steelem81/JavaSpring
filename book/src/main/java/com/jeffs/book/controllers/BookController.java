package com.jeffs.book.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {
	
	@GetMapping("/books/2")
	public String index() {
		
		return "index.jsp";
	}

}
