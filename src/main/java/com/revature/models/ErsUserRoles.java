package com.revature.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ErsUserRoles 
{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int ers_user_role_id;
	private String user_role;
	
	public ErsUserRoles(int userRoleId, String userRole)
	{
		this.ers_user_role_id = userRoleId;
		this.user_role = userRole;
	}
	
	// getter methods
	public int getUserRoleId()
	{
		return ers_user_role_id;
	}
	
	public String getUserRole()
	{
		return user_role;
	}
	
	// setter methods
	public void setUserRoleId(int userRoleId)
	{
		this.ers_user_role_id = userRoleId;
	}
	
	public void setUserRole(String userRole)
	{
		this.user_role = userRole;
	}
}
