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

@Entity
@Table(name = "client")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class Client 
{    
	
	@Id
	 @GeneratedValue
	 @Column(name = "clientid")
	private int clientid;
	 
	 @Column(name = "clientname")
	private String clientname;
	
	 @Column(name = "projectid")
	 private String projectid;
	
	 @Column(name = "projectname")
	 private String projectname;
	
	 @Column(name = "description")
	 private String description;
	 @Column(name = "email")
	 private String email;
	 
	
	 public String getEmail() {
		return email;
	}
	 @XmlElement
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	public int getClientid() {
		return clientid;
	}
	
	 @XmlElement
	public void setClientid(int clientid) {
		this.clientid = clientid;
	}
	public String getClientname() {
		return clientname;
	}
	
	 @XmlElement
	public void setClientname(String clientname) {
		this.clientname = clientname;
	}
	public String getProjectid() {
		return projectid;
	}
	
	 @XmlElement
	public void setProjectid(String projectid) {
		this.projectid = projectid;
	}
	public String getProjectname() {
		return projectname;
	}
	 @XmlElement
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	public String getDescription() {
		return description;
	}
	 @XmlElement
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
}
