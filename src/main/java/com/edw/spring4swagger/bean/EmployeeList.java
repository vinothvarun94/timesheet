package com.edw.spring4swagger.bean;

import java.util.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "employees")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class EmployeeList {

	 private List<Employee> employees;

	 public EmployeeList() {
		 employees= new ArrayList<Employee>();
		    }

	 
	 public EmployeeList(List<Employee> items) {
			this.employees = items;
		    }


	 @XmlElement(name = "employee")
	    public List<Employee> getEmployees() {
		return employees;
	    }
	 
	 public void setEmployees(List<Employee> items) {
			this.employees = items;
		    }

}
