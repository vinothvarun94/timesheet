package com.edw.dao;

import com.edw.spring4swagger.bean.AssignTask;
import com.edw.spring4swagger.bean.Client;
import com.edw.spring4swagger.bean.Employee;
import com.edw.spring4swagger.bean.Project;
import com.edw.spring4swagger.bean.TimeSheet;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;


public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	 SessionFactory sessionFactory;
	
	@Autowired
	 SessionFactory sessionFactory2;
	
	@Autowired
	 SessionFactory sessionFactory3;
	@Autowired
	 SessionFactory sessionFactory4;
	
	@Autowired
	 SessionFactory sessionFactory5;

	@Autowired
	 SessionFactory sessionFactory6;
	
	
	
	
	 Session session = null;
	 Session session2 = null;
	 Session session3 = null;
	 Session session4 = null;
	 Session session5 = null;
	 Session session6 = null;
	 
	 
	 Transaction tx = null;
	 	 
	public Employee addEmployee(Employee employee) throws Exception {
		session = sessionFactory.openSession();
		  tx = session.beginTransaction();
		  session.save(employee);
		  tx.commit();
		  session.close();
		  
		  System.out.println("added successfully");
		return employee;
	}

	@SuppressWarnings("unchecked")
	 @Override
	public List<Employee> getEmployees() {
		
		session = sessionFactory.openSession();
		  tx = session.beginTransaction();
		  List<Employee> employeeList = session.createCriteria(Employee.class)
		    .list();
		  tx.commit();
		  session.close();
		  
		  return employeeList;
		
		
		 
		 
		
		
		 }
	
	
	
	

	@Override
	public boolean deleteEmployeeById(Integer id) throws Exception {
		
		session = sessionFactory.openSession();
		  Object o = session.load(Employee.class, id);
		  tx = session.getTransaction();
		  session.beginTransaction();
		  session.delete(o);
		  tx.commit();
		  System.out.println("deleted  successfully");
		  return false;
	}


	@Override
	public Employee updatePartialEmployee(Integer id, Employee employee) throws Exception {
		
		
		try{
			
			
			session = sessionFactory.openSession();
			 Employee db_empl = (Employee) session.load(Employee.class,
					    new Integer(id));
			
			Transaction tx3 = session.beginTransaction();
			tx3.commit();
			
			
			Transaction tx4 = session.beginTransaction();
			
			db_empl.setAddress(employee.getAddress());
			
			db_empl.setName(employee.getName());
			
			db_empl.setEmail(employee.getEmail());
			
			db_empl.setRole(employee.getRole());
			
			db_empl.setSkill(employee.getSkill());
			
			db_empl.setSalary(employee.getSalary());
			
			
			session.saveOrUpdate(db_empl);
			
			System.out.println("UPdated successfully");
			
			tx4.commit();
			
			
			
			return employee;
		}
		catch (Exception e) {
			
		}
		
		return null;
	}



	@Override
	public Employee getEmployeeById(Integer id, String password) throws Exception {
		 session = sessionFactory.openSession();
		 
		  Employee employee = (Employee) session.load(Employee.class, new Integer(id));
		  tx = session.getTransaction();
		  
		  session.beginTransaction();
		  
		  tx.commit();
		  System.out.println("get employee detail successfully");
		  System.out.println(password);
		  String pass=employee.getPassword();
		  System.out.println(pass);
		  if(pass.equals(password))
		  {
			  System.out.println("validation is successs");
		      return employee;
		  }
		  
		  return null;
	}
	
	
	

	
	@Override
	public AssignTask assigntask(AssignTask assigntask) {
		session2 = sessionFactory2.openSession();
		  tx = session2.beginTransaction();
		  session2.save(assigntask);
		  tx.commit();
		  session2.close();
		  
		  System.out.println("Task added successfully");
		return assigntask;
		
	}


	@Override
	public Project addproject(Project project) {
		session3 = sessionFactory3.openSession();
		  tx = session3.beginTransaction();
		  session3.save(project);
		  tx.commit();
		  session3.close();
		  
		  System.out.println("Project added successfully");
		return project;
	}



	@Override
	public TimeSheet timesheet(TimeSheet timesheet) {
		session4 = sessionFactory4.openSession();
		  tx = session4.beginTransaction();
		  session4.save(timesheet);
		  tx.commit();
		  session4.close();
		  
		  System.out.println("Task added successfully");
		return timesheet;
	}

	@Override
	public Client addclient(Client client) {
		  session5 = sessionFactory5.openSession();
		  tx = session5.beginTransaction();
		  session5.save(client);
		  tx.commit();
		  session5.close();
		  System.out.println("Client added successfully");
		return client;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<AssignTask> getTask(String date,Integer id) {

		/*  session2 = sessionFactory2.openSession();
		  tx = session2.beginTransaction();
		  List<AssignTask> assigntask = session2.createCriteria(AssignTask.class)
		    .list();
		  
		  
		  tx.commit();
		  session2.close();
		  
		  return assigntask;
		  */

		  session6 = sessionFactory6.openSession();
		
		  tx = session6.beginTransaction();
		  Criteria cr=session6.createCriteria(AssignTask.class);
		  
		  Criterion date1 = Restrictions.like("date", date);
		  Criterion empid1 = Restrictions.like("empid", id);
		  LogicalExpression orExp = Restrictions.and(date1, empid1);
		  cr.add( orExp );
		 
		
		  
		  //LogicalExpression andExp = Restrictions.and(date1);
		  
		  
		  List<AssignTask> l=cr.list();
		  tx.commit();
		  session6.close();
		  
		  return l;
		  
		  
		  
	}

	@Override
	public Employee getProfile(Integer id) {
		 session = sessionFactory.openSession();
		 
		  Employee employee = (Employee) session.load(Employee.class, new Integer(id));
		  tx = session.getTransaction();
		  
		  session.beginTransaction();
		  
		  tx.commit();
		  System.out.println("Profile info");
		 
		 return employee;
	}
}
