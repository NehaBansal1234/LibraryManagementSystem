package dataaccess;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Librarian extends Person implements Serializable
{
	
	List<Role> roles;
	public Librarian(String firstName, String lastName, String telephone, String credentials, String shortBio, Role role,
			Address address,String id) {
		super(firstName,lastName,telephone,credentials,shortBio,role,address);
		this.roles=new ArrayList<Role>();
     }
	public List<Role> getRoles() {
		return roles;
	}
	
	/*public void addNewMember(Librarian librarian)
	{
		for(Role role:librarian.getRoles())
		{
			if(role)
		}
	}*/
	
	
}