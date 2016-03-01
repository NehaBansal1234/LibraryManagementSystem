package dataaccess.storage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Librarian extends Person implements Serializable
{
	List<Role> roles;
	
	public Librarian(String firstName, String lastName, String telephone, String credentials, String shortBio, 
			Address address,Role role) {
		super(firstName,lastName,telephone,credentials,shortBio,address);
		this.roles=new ArrayList<Role>();
		this.roles.add(role);
     }
	
	public List<Role> getRoles() {
		return roles;
	}
	
	public void addRole(Role role){
		this.roles.add(role);
	}

	/*public void addNewMember(Librarian librarian)
	{
		for(Role role:librarian.getRoles())
		{
			if(role)
		}
	}*/
	
	
}