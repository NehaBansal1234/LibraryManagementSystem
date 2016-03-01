package dataaccess.storage;

import java.io.Serializable;
import java.util.UUID;

public class BookCopy implements Serializable{
	
	UUID id;
	boolean isAvailable;
	Book book;
	
	public BookCopy(Book book){
		this.book = book;
		this.isAvailable = true;
		this.id = UUID.randomUUID(); 
	}
	
	public UUID getId(){
		return id;
	}

}
