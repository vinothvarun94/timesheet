package com.edw.spring4swagger.bean;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;



@Entity
@Table(name = "employee")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class Employee implements Serializable  {

	 private static final long serialVersionUID = 1L;

	 
	
	 @Id
	 @GeneratedValue
	 @Column(name = "id")
	 private Integer id;

	 

	 @Column(name = "name")
	 private String Name;

	 @Column(name="email")
     private String Email;
	 
	
	 @Column(name="skill")
	 private String Skill;
	 

	 @Column(name="role")
	 private String Role;
	 
	
	 @Column(name="salary")
	 private int Salary;
	 

	 @Column(name="address")
     private String Address;
	 
	 @Column(name="password")
	 private String password;
	
	
	 public long getId() {
		return id;
	}



	 public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	@XmlElement
	public void setId(Integer id) {
		this.id = id;
	}




	public String getName() {
		return Name;
	}



	 @XmlElement
	public void setName(String name) {
		Name = name;
	}


	
	
	
	


	public String getAddress() {
		return Address;
	}



	 @XmlElement
	public void setAddress(String address) {
		Address = address;
	}




	public String getEmail() {
		return Email;
	}



	 @XmlElement
	public void setEmail(String email) {
		Email = email;
	}




	public String getSkill() {
		return Skill;
	}



	 @XmlElement
	public void setSkill(String skill) {
		Skill = skill;
	}




	public String getRole() {
		return Role;
	}



	 @XmlElement
	public void setRole(String role) {
		Role = role;
	}




	public int getSalary() {
		return Salary;
	}



	 @XmlElement
	public void setSalary(int salary) {
		Salary = salary;
	}




	@Override
	    public String toString() {
		return "Employee [id=" + id + ", Name=" + Name +",Address="+Address+",email="+Email+",skill="+Skill+",role="+Role+",salary="+Salary                
			+ "]";
	    }






	



	
	
	
}
