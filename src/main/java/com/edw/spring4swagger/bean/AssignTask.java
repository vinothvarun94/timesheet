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
@Table(name = "assigntask")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class AssignTask implements Serializable {	
	private static final long serialVersionUID = 1L;
	 
	 @Column(name = "dept")
	 private String dept;
	 @Column(name = "pname")
	 private String pname;
	 
	 
	 @Id
	 @GeneratedValue
	 @Column(name="taskid")
     private Integer taskid;
	 
	 
	 
	 @Column(name="empid")
     private Integer empid;
	 @Column(name="taskname")
	 private String taskname;
	 @Column(name="description")
	 private String description;
	 @Column(name="duration")
	 private String duration;
	 
	 @Column(name="date")
	 private String date;
	 
	 public String getDate() {
		return date;
	}
	 
	 @XmlElement(name="date")
	public void setDate(String date) {
		this.date = date;
	}

	public String getDept() {
			return dept;
		}

	 @XmlElement(name="dept")
		public void setDept(String dept) {
			this.dept = dept;
		}

		public String getPname() {
			return pname;
		}

		@XmlElement(name="pname")
		public void setPname(String pname) {
			this.pname = pname;
		}

		
		public Integer getEmpid() {
			return empid;
		}

		@XmlElement(name="empid")
		public void setEmpid(Integer empid) {
			this.empid = empid;
		}

		public String getTaskname() {
			return taskname;
		}

		@XmlElement(name="taskname")
		public void setTaskname(String taskname) {
			this.taskname = taskname;
		}

		public String getDescription() {
			return description;
		}

		@XmlElement(name="description")
		public void setDescription(String description) {
			this.description = description;
		}

		public String getDuration() {
			return duration;
		}

		@XmlElement(name="duration")
		public void setDuration(String duration) {
			this.duration = duration;
		}
		@Override
	    public String toString() {
		return " [dept=" + dept + ", pname=" + pname +",empid="+empid+",taskname="+taskname+",description="+description+",duration="+duration+"]";
	    }
	
}


