package dataaccess;

import java.io.Serializable;

public class LibraryMember extends Person implements Serializable{
	
	int memberId;
	CheckoutRecord checkOutRecord;
	
	public LibraryMember(String firstName, String lastName, String telephone, String credentials, String shortBio, Role role,
			Address address,int id)
	{
		super(firstName,lastName,telephone,credentials,shortBio,role,address);
		this.memberId=id;
	}

}
