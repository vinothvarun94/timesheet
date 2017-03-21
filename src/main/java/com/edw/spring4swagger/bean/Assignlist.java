package com.edw.spring4swagger.bean;

import java.util.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "assigntasks")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Assignlist {

	 private List<AssignTask> assigntasks;
	 
	 
	 
	 @XmlElement(name = "assigntask")
	 public List<AssignTask> getAssigntasks() {
		return assigntasks;
	}


	public void setAssigntasks(List<AssignTask> assigntasks) {
		this.assigntasks = assigntasks;
	}


	public Assignlist() {
		 assigntasks= new ArrayList<AssignTask>();
		    }

	 
	 public Assignlist(List<AssignTask> items) {
			this.assigntasks = items;
		    }


	
	   

}
