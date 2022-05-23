package com.training.web.withfeignclient.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.training.web.withfeignclient.dto.Book;



@Service
public interface StudentService {

	public List<Book> listAllBooks() ;
	
	
	
}
