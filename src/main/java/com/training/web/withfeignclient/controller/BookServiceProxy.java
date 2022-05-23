package com.training.web.withfeignclient.controller;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.training.web.withfeignclient.dto.Book;
//url only in kubernetes
//by default in localmachine
//localhost -optional

@FeignClient(name="book-service",url="localhost:9111")
public interface BookServiceProxy {
	
	@GetMapping("/books/list")
	public List<Book> listAllBooks();
	

}
