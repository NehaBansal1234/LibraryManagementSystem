package dataaccess;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import dataaccess.storage.*;

public class Main {
	public static void main(String[] args){
		DataAccess dataAccess = loadInitialData();
		FileSerialization.serializeData(dataAccess);
		DataAccess dataAccess1 = FileSerialization.deSerializeData();
		for(LibraryMember member:dataAccess1.getMembers().values()){
			System.out.println(member.getFirstName() + " " + member.getLastName());
		}
	}
			
    public static DataAccess loadInitialData() {
    	
		DataAccess dataAccess = new DataAccessFacade();
		
		Address address = new Address("1000 N,4TH STREET", "FAIFIELD", "IA", "52557");
		Role admin = new AdministratorRole();
		Role librarian = new LibrarianRole();
		
		// add 4 members
		
		LibraryMember member1 = new LibraryMember("Jerry", "Lewis", "641-888-111", "student", "", address);
		dataAccess.addMember(member1);
		LibraryMember member2 = new LibraryMember("Kevin", "Lewis", "641-888-112", "student", "", address);
		dataAccess.addMember(member2);
		LibraryMember member3 = new LibraryMember("Tom", "Lewis", "641-888-113", "student", "", address);
		dataAccess.addMember(member3);
		LibraryMember member4 = new LibraryMember("Merry", "Lewis", "641-888-114", "student", "", address);
		dataAccess.addMember(member4);
		
		// add 2 Librarian, 1 is Admin, 1 is Librarian
		//Librarian( firstName,   lastName,  telephone,  credentials,  shortBio,  address, userName ,Password) 
		dataAccess.addLibrarian(new Librarian("John", "Lewis", "641-888-115", "Admin", "", address, admin , "JohnLewis", "JohnLewis"));
		dataAccess.addLibrarian(new Librarian("Edward", "Lewis", "641-888-116", "Admin", "", address, librarian ,"EdwardLewis" ,"EdwardLewis"));
		
		Author author1 = new Author("Patti", "Smith", "641-888-117", "author", "", address);
	//	dataAccess.addAuthor(author1);
		Author author2 = new Author("George", "Bush", "641-888-118", "author", "", address);
	//	dataAccess.addAuthor(author2);
		Author author3 = new Author("Barbra", "Streisand", "641-888-119", "author", "", address);
	//	dataAccess.addAuthor(author3);
		Author author4 = new Author("Jeff", "Potter", "641-888-120", "author", "", address);
	//	dataAccess.addAuthor(author4);
		Author author5 = new Author("Michael", "Freeman", "641-888-121", "author", "", address);
	//	dataAccess.addAuthor(author5);
		Author author6 = new Author("Steve", "McConnell", "641-888-122", "author", "", address);
	//	dataAccess.addAuthor(author6);
		Author author7 = new Author("Massimo", "Banzi", "641-888-123", "author", "", address);
	//	dataAccess.addAuthor(author7);

        // add 4 books 
		Book book1 = new Book("0060936223", "just Kids", 21, author1);
		dataAccess.addBook(book1);
        BookCopy[] bookCopy1 = dataAccess.addCopy(book1, 3);
        
        Book book2 = new Book("0307590615", "Decision Points", 21, author2);
        dataAccess.addBook(book2);
        BookCopy[] bookCopy2 = dataAccess.addCopy(book2, 3);
        
        Book book3 = new Book("0670022136", "My Passion for Design", 7, author3);
        dataAccess.addBook(book3);
        BookCopy[] bookCopy3 = dataAccess.addCopy(book3, 1);
        
        Book book4 = new Book("0596805888", "Cooking for Geeks", 7, author4);
        dataAccess.addBook(book4);
        BookCopy[] bookCopy4 = dataAccess.addCopy(book4, 1);
        
        try{
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        
        CheckoutRecord checkoutRecord1 = new CheckoutRecord();
        CheckoutEntry entry1 = new CheckoutEntry(bookCopy1[1], format.parse("02/25/2016"), format.parse("03/17/2016"));
        checkoutRecord1.addCheckoutEntry(entry1);
        member1.setCheckoutRecord(checkoutRecord1);
        
        CheckoutRecord checkoutRecord2 = new CheckoutRecord();
        member2.setCheckoutRecord(checkoutRecord2);
        CheckoutEntry entry2 = new CheckoutEntry(bookCopy2[1], format.parse("02/26/2016"), format.parse("03/18/2016"));
        checkoutRecord2.addCheckoutEntry(entry2);
        
        CheckoutRecord checkoutRecord3 = new CheckoutRecord();
        member3.setCheckoutRecord(checkoutRecord3);
        CheckoutEntry entry3 = new CheckoutEntry(bookCopy3[0], format.parse("03/01/2016"), format.parse("03/07/2016"));
        checkoutRecord2.addCheckoutEntry(entry3);
        
        CheckoutRecord checkoutRecord4 = new CheckoutRecord();
        member4.setCheckoutRecord(checkoutRecord4);
        CheckoutEntry entry4 = new CheckoutEntry(bookCopy4[0], format.parse("03/02/2016"), format.parse("03/07/2016"));
        checkoutRecord2.addCheckoutEntry(entry4);
        }catch(ParseException ex){
        	ex.getStackTrace();
        	
        }
        
        return dataAccess;

    }
}
