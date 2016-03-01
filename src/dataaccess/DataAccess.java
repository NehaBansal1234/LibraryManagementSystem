package dataaccess;

import java.util.Hashtable;
import java.util.UUID;

import dataaccess.storage.Author;
import dataaccess.storage.Book;
import dataaccess.storage.BookCopy;
import dataaccess.storage.Librarian;
import dataaccess.storage.LibraryMember;

public interface DataAccess {
    public Hashtable<UUID, BookCopy> getCopies();
    public Hashtable<UUID, Librarian> getLibrarians();
	public Hashtable<UUID, Book> getBooks();
    public Hashtable<UUID, LibraryMember> getMembers();
    public void addMember(LibraryMember member);
	public void addLibrarian(Librarian librarian);
    public void addBook(Book book);
    public BookCopy[] addCopy(Book book, int numberOfCopies);
}
