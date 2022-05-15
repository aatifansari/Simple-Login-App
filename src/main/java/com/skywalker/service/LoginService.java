package com.skywalker.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import com.skywalker.dto.User;

public class LoginService {
	
	HashMap<String, ArrayList> users = new HashMap<String, ArrayList>();
	
	public LoginService() {
		
		// in-memory data handling
		users.put("salman", new ArrayList(Arrays.asList("Salman Developer", 23, 'M')));
		users.put("ankit", new ArrayList(Arrays.asList("Ankit SDET", 22, 'M')));
		users.put("kavita", new ArrayList(Arrays.asList("Kavita DevOps", 25, 'F')));		
	}
	
	public boolean authenticate(String userName,
			String password) {
		
		String theUserName=null;
		
		// validate username
		try {
			
			theUserName=(String)users.get(userName).get(0);
			
		}
		
		catch(Exception exc) {
			
			return false;
		}
		
		// validate password
		if(password==null||password.equals("")) {
			return false;
		}
		
		return true;
		
	}
	
	// fetch user details from HashMap
	public User getUserDetails(String userName) {
		
		User user = new User();	
		
		// get username
		user.setUserName((String)users.get(userName).get(0));
		
		// set username
		user.setUserId(userName);
		
		// set user's age
		user.setAge((Integer)users.get(userName).get(1));
		
		// set user's gender
		user.setGender((Character)users.get(userName).get(2));
		
		
		return user;
		
	}

}

