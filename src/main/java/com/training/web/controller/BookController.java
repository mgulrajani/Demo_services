package com.training.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.web.entities.Book;
import com.training.web.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {
     @Autowired
	private BookService service;
	
	@GetMapping("/list")
	public List<Book> getAllBooks(){
		return service.getAllBooks();
	}
}
