package com.training.web.withfeignclient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.web.withfeignclient.dto.Book;
import com.training.web.withfeignclient.service.StudentService;

@RestController
@RequestMapping("/books")
public class StudentController {

	/*
	 * @Autowired StudentService service ;
	 */
	
	@Autowired
	BookServiceProxy bookServiceProxy;
	
	
	@GetMapping("/list")
	public ResponseEntity<List<Book>> getBookList(){
		
		return new ResponseEntity<List<Book>>(bookServiceProxy.listAllBooks(),HttpStatus.OK);
	}
	
	
}
