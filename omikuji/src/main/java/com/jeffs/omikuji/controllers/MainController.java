package com.jeffs.omikuji.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

	@GetMapping("/omikuji")
	public String index(HttpSession session) {
		return "index.jsp";
	}
	
	@GetMapping("/sendOmikuji")
	public String sendOmikuji(HttpSession session, Model model,
		@RequestParam(value="luckyNumber") int luckyNumber,
		@RequestParam(value="city") String city,
		@RequestParam(value="person") String person,
		@RequestParam(value="hobby") String hobby,
		@RequestParam(value="type") String type,
		@RequestParam(value="somethingNice") String somethingNice
		) {
		session.setAttribute("luckyNumber", luckyNumber);
		session.setAttribute("city", city);
		session.setAttribute("person", person);
		session.setAttribute("hobby", hobby);
		session.setAttribute("type",  type);
		session.setAttribute("somethingNice", somethingNice);
		System.out.println(session.getAttribute(somethingNice));
		
		model.addAttribute("luckyNumber", session.getAttribute("luckyNumber"));
		model.addAttribute("city", session.getAttribute("city"));
		model.addAttribute("person", session.getAttribute("person"));
		model.addAttribute("hobby", session.getAttribute("hobby"));
		model.addAttribute("type", session.getAttribute("type"));
		model.addAttribute("somethingNice", session.getAttribute("somethingNice"));
		
	return "omikuji.jsp";
	}
	
	@GetMapping("/omikuji/show")
	public String showOmikuji(HttpSession session, Model model) {
		model.addAttribute("luckyNumber", session.getAttribute("luckyNumber"));
		model.addAttribute("city", session.getAttribute("city"));
		model.addAttribute("person", session.getAttribute("person"));
		model.addAttribute("hobby", session.getAttribute("hobby"));
		model.addAttribute("type", session.getAttribute("type"));
		model.addAttribute("somethingNice", session.getAttribute("somethingNice"));
		
		
		
		return "omikuji.jsp";
	}
}

