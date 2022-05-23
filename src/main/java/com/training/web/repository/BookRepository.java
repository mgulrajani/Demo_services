package com.training.web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.training.web.entities.Book;

public interface BookRepository  extends JpaRepository<Book, Long>{

}
