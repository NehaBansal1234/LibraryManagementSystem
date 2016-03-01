package dataaccess;

import java.io.Serializable;

public class Author extends Person implements Serializable {
	String authorId;
	
	public Author(String firstName, String lastName, String telephone, String credentials, String shortBio, Role role,
			Address address,String id) {
		super(firstName,lastName,telephone,credentials,shortBio,role,address);
		this.authorId=id;
		
	}
	

}
