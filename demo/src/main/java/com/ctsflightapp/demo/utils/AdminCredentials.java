package com.ctsflightapp.demo.utils;

import java.util.HashMap;

public class AdminCredentials {
	
	private static HashMap<String,String> mp=new HashMap<>();
	
	static {
		mp.put("Sarath", "Sarath123");
		mp.put("Sam","Sam123");
	}
	
	public String login(String userName, String password) {
		
		if(mp.get(userName)!=null) {
			if(mp.get(userName)==password)
			{
				return "Login Successfull";
			}
			else
			{
				return "invalid password";
			}
		}
		else
			return "invalid username";
	}

}
