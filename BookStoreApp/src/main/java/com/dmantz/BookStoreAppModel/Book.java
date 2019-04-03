package com.dmantz.BookStoreAppModel;

public class Book {
	
	private Integer ID;

	private String Name;
	
    private String Author;
	
	private Integer Value;
	
	@Override
	public String toString() {
		return "Book [ID=" + ID + ", Name=" + Name + ", Author=" + Author + ", Value=" + Value + "]";
	}
	

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public Integer getValue() {
		return Value;
	}

	public void setValue(Integer value) {
		Value = value;
	}

	
	

}
