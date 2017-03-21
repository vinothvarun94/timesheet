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
@Table(name = "timesheet")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class TimeSheet implements Serializable{
	private static final long serialVersionUID = 1L;
	 
	
	 @Column(name = "pname")
	 private String pname;
	 
	 
	 @Id
	 @GeneratedValue
	 @Column(name="statusid")
	 private Integer statusid;
	 
	 
	 
	 @Column(name="empid")
	 private Integer empid;
	 @Column(name="task")
	 private String task;
	 @Column(name="date")
	 private String date;
	 @Column(name="description")
	 private String description;
	 @Column(name="stime")
	 private String stime;
	 @Column(name="etime")
	 private String etime;
	 @Column(name="status")
	 private String status;
	public String getPname() {
		return pname;
	}
	 @XmlElement
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Integer getEmpid() {
		return empid;
	}
	 @XmlElement
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getTask() {
		return task;
	}
	 @XmlElement
	public void setTask(String task) {
		this.task = task;
	}
	public String getDate() {
		return date;
	}
	 @XmlElement
	public void setDate(String date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	 @XmlElement
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStime() {
		return stime;
	}
	 @XmlElement
	public void setStime(String stime) {
		this.stime = stime;
	}
	public String getEtime() {
		return etime;
	}
	 @XmlElement
	public void setEtime(String etime) {
		this.etime = etime;
	}
	public String getStatus() {
		return status;
	}
	 @XmlElement
	public void setStatus(String status) {
		this.status = status;
	}
	 
	
}
