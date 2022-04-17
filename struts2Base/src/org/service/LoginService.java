//$Id$
package org.service;

import org.buisnessLogics.user;

public class LoginService {
	
	public boolean validateUser(user user) {
		
		if(user.getUserid().equals("userid") && user.getPassword().contentEquals("password"))
			return true;
		return false;
	}

}
