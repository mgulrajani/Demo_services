package com.training.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.training.web.entities.Book;
import com.training.web.repository.BookRepository;

@Service
public class BookService {
	
	
	@Autowired
	private BookRepository repo;

   public List<Book> getAllBooks(){
	     
	 List<Book> list=  repo.findAll();
	  
	 return list;
	 
   }
   
   

}
