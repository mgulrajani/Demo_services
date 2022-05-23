package com.training.web.withfeignclient.dto;

import java.time.LocalDate;

public class Book {

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(Long id, String title, LocalDate dateOfPublishing, double price) {
		super();
		this.id = id;
		this.title = title;
		this.dateOfPublishing = dateOfPublishing;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", dateOfPublishing=" + dateOfPublishing + ", price=" + price
				+ "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public LocalDate getDateOfPublishing() {
		return dateOfPublishing;
	}
	public void setDateOfPublishing(LocalDate dateOfPublishing) {
		this.dateOfPublishing = dateOfPublishing;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	private Long id;
	private String title;
	private LocalDate dateOfPublishing;
	private double price;
	
	
}
