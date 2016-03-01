package dataaccess;

import java.io.Serializable;

public class AdministratorRole implements Role,Serializable{
	
	String role;

	public AdministratorRole(String role) {
		this.role = "ADMIN";
	}
	

}
