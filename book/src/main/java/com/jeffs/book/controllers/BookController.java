package com.jeffs.book.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.jeffs.book.models.Book;
import com.jeffs.book.services.BookService;

@Controller
public class BookController {
	
	@Autowired
	private BookService bookServ;
	
	@GetMapping("/books")
	public String index(Model model) {
		List<Book> books = bookServ.allBooks();
		model.addAttribute("allBooks", books);
		return "index.jsp";
	}
	
	@GetMapping("/books/{id}")
	public String viewBook(@PathVariable(name="id") Long id, Model model) {
		Book book = bookServ.findBook(id);
		model.addAttribute("book", book);
		return "viewBook.jsp";
	}
	
	@GetMapping("/book/create")
	public String newBook(@ModelAttribute("book")Book book) {
		return "newBook.jsp";
	}
	
	@PostMapping("/book/create")
	public String createBook(@Valid @ModelAttribute("book")Book book, BindingResult result) {
		bookServ.createBook(book);
		return "redirect:/";
	}

}
