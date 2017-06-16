package com.model;

public class Book {
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	private String name;
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getAuthor()=" + getAuthor() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	private String author;
	public void init()
	{
System.out.println("init method is running");
	}
	public void destroy()
	{
		System.out.println("destroy method is running");
	}
}
