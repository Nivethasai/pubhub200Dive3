package com.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.model.Book;

@Configuration
public class BookConfiguration {
	@Bean(initMethod="init",destroyMethod="destroy")
	public Book book(){
		return new Book();
	}
	
	
	

}
