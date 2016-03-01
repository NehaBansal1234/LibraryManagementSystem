package dataaccess;

import dataaccess.storage.*;
import java.util.Hashtable;
import java.util.UUID;
import java.io.Serializable;

public class DataAccessFacade implements DataAccess, Serializable{
	
	private Hashtable<UUID, LibraryMember> members;
	private Hashtable<UUID, Librarian> librarians;
    private Hashtable<UUID, Book> books;
    private Hashtable<UUID, BookCopy> copies;
    
	public DataAccessFacade(){
		members = new Hashtable<>();
		librarians = new Hashtable<>();
		books = new Hashtable<>();
		copies = new Hashtable<>();
	}
	
    public Hashtable<UUID, BookCopy> getCopies() {
        return copies;
    }
    
    public Hashtable<UUID, Librarian> getLibrarians() {
		return librarians;
	}


	public Hashtable<UUID, Book> getBooks() {
        return books;
    }

    public Hashtable<UUID, LibraryMember> getMembers() {
        return members;
    }
    
    public void addMember(LibraryMember member) {
        members.put(member.getId(), member);
    }
    
	public void addLibrarian(Librarian librarian) {
		librarians.put(librarian.getId(), librarian);
	}

	
    public void addBook(Book book) {
        books.put(book.getId(), book);
    }

    public BookCopy[] addCopy(Book book, int numberOfCopies) {
        BookCopy[] arr = book.addNumberOfCopies(numberOfCopies);
        for (BookCopy c : arr) {
            copies.put(c.getId(), c);
        }
        return arr;
    }

    

	
}
