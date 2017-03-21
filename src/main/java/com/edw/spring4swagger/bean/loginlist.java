package com.edw.spring4swagger.bean;

import java.util.*;



public class loginlist {

	 private List<login> login;
	 

	 public loginlist()
	 {
		 login= new ArrayList<login>();
	 }

	 
	 public loginlist(List<login> items) {
			this.login = items;
		    }

	 
	 
	 
	 
	 
	 
	 
	 public List<login> getLogin() {
		return login;
	}


	public void setLogin(List<login> login) {
		this.login = login;
	}


	



	 
	 

}
