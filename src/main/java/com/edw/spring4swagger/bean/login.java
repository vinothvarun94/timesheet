package com.edw.spring4swagger.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;



public class login {

		
private long id;
	 private String name;
private String password;
private String role;

public long getId() {
	return id;
}

public void setId(long l) {
	this.id = l;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getRole() {
	return role;
}

public void setRole(String role) {
	this.role = role;
}

@Override
public String toString() 
{
return "Login [id=" + id + ", name=" + name +",password="+password+",role="+role+",skill="+"]";
}




}
