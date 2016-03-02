package dataaccess.storage;
import java.io.Serializable;

public class LibraryMember extends Person implements Serializable{
	
	CheckoutRecord checkOutRecord;
	String memberID ;
	
	public LibraryMember(String _id ,String firstName, String lastName, String telephone, String credentials, String shortBio/*, Role role*/,
			Address address)
	{
		super(firstName,lastName,telephone,credentials,shortBio/*,role*/,address);

		this.memberID = _id ;
	}
	
	public CheckoutRecord getCheckoutRecord(){
		return checkOutRecord;
	}

	public void setCheckoutRecord(CheckoutRecord checkOutRecord){
		this.checkOutRecord = checkOutRecord;
	}
}
