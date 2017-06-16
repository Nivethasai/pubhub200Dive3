package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.configure.BookConfiguration;
import com.model.Book;

public class BookTest {
	private static ApplicationContext context;
	public static void main(String[] args)
	{
		context = new AnnotationConfigApplicationContext(BookConfiguration.class);
		Book book=(Book)context.getBean(Book.class);
		book.setId(44);
		book.setName("nivi");
		book.setAuthor("john");
		System.out.println(book);
		((AbstractApplicationContext) context).close();
	}

}
