package business;

import java.io.Serializable;

public class AdministratorRole implements Role,Serializable{
	
	String role;

	public AdministratorRole(String role) {
		this.role = "ADMIN";
	}
	

}
