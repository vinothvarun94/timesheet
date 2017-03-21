package com.edw.spring4swagger.bean;

import java.io.Serializable;

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
@Table(name = "project")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class Project implements Serializable {	
	private static final long serialVersionUID = 1L;
	 
	
	  @Id
	 @GeneratedValue
	 @Column(name="pid")
     private Integer pid;
	 
	  @Column(name = "pname")
		 private String pname;
		
	 
	 @Column(name="clientname")
	 private String clientname;
	 
	 @Column(name="description")
	 private String description;
	 
	 @Column(name="duration")
	 private String duration;

	
	 public Integer getPid() {
		return pid;
	}
		@XmlElement
	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}
	@XmlElement
	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getClientname() {
		return clientname;
	}
	@XmlElement
	public void setClientname(String clientname) {
		this.clientname = clientname;
	}

	public String getDescription() {
		return description;
	}
	@XmlElement
	public void setDescription(String description) {
		this.description = description;
	}

	public String getDuration() {
		return duration;
	}
	@XmlElement
	public void setDuration(String duration) {
		this.duration = duration;
	}

	
	@Override
    public String toString() {
	return "Project [pid=" + pid + ", pname=" + pname +",clientname"+clientname+",description"+description+",duration"+duration+"]";
    }
	
	
	
}
