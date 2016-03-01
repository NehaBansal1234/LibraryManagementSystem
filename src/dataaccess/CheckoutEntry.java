package dataaccess;

import java.io.Serializable;
import java.util.Date;

public class CheckoutEntry implements Serializable{
	
	BookCopy bookCopy;
	Date checkoutDate;
	Date dueDate;

}
