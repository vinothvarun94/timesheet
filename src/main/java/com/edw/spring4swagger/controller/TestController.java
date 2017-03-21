package com.edw.spring4swagger.controller;

import com.edw.services.EmployeeService;
import com.edw.spring4swagger.bean.AssignTask;
import com.edw.spring4swagger.bean.Assignlist;
import com.edw.spring4swagger.bean.Client;
import com.edw.spring4swagger.bean.Employee;
import com.edw.spring4swagger.bean.EmployeeList;
import com.edw.spring4swagger.bean.Project;
import com.edw.spring4swagger.bean.Test;
import com.edw.spring4swagger.bean.TimeSheet;
import com.edw.spring4swagger.bean.login;
import com.edw.spring4swagger.bean.loginlist;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import io.swagger.annotations.ApiOperation;
import io.swagger.models.Response;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.TypeMismatchException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;



/**
 * 
 *
 * 
 * Sep 25, 2016 1:18:47 PM
 *
 */
@RestController
public class TestController {

	 @Autowired
	 EmployeeService dataServices;
	 
	  @Autowired
	    private MessageSource messageSource;
	
	
	 /*to test swagger*/
	  
	                                 
	  
    @ApiOperation(value = "Testing Page")
    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public Test test(@RequestParam String name, @RequestParam(required = false) String address) {
        Test test = new Test();
        test.setAddress(address);
        test.setName(name);
        return test;
    }

                                                                                                                             
  
    /*add employee*/
    
    @ApiOperation(value = "To add new Employee",notes="Method for add new employee",response=Employee.class)
    @RequestMapping(value = "/addEmployee", method = RequestMethod.POST,consumes = "application/json", produces = "application/json")
    public @ResponseBody
   Employee employee(@RequestBody Employee employee) {
       
       Employee e=(Employee)dataServices.addEmployee(employee);
  		return e;
     
    }
    
    /*assign task */
    
    @ApiOperation(value = "To assign new task",notes="Method for assigning task",response=AssignTask.class)
    @RequestMapping(value = "/AssignTask", method = RequestMethod.POST,consumes = "application/json", produces = "application/json")
    public @ResponseBody
    String assigntask(@RequestBody AssignTask assigntask,HttpSession session) {
    Object b=session.getAttribute("role");
      
      
      String role=(String) b;
      System.out.println(role);
      
     
    	AssignTask e=(AssignTask)dataServices.assigntask(assigntask);
  		return role;
     
    }
/*TimeSheet */
    
    @ApiOperation(value = "View Timesheet",notes="Method for viewing Timesheet",response=TimeSheet.class)
    @RequestMapping(value = "/TimeSheet", method = RequestMethod.POST,consumes = "application/json", produces = "application/json")
    public @ResponseBody
    String timesheet(@RequestBody TimeSheet timesheet,HttpSession session) {
    	 Object b=session.getAttribute("role");
         
         
         String role=(String) b;
         System.out.println(role);
    	TimeSheet e=(TimeSheet)dataServices.timesheet(timesheet);
  		return role;
     
    }

/*Get Session ID */
    @ApiOperation(value = "View ID",notes="Method for viewing Session ID",response=TimeSheet.class)
       @RequestMapping(value = "/getid", method = RequestMethod.POST,consumes = "application/json", produces = "application/json")
    public @ResponseBody
    String getid(HttpSession session) {
    	 Object b=session.getAttribute("id");
         
         
         String id=(String) b;
         System.out.println(id);
    	
  		return id;
     
    }
   
    
/*add Project*/
    
    @ApiOperation(value = "To add new Project",notes="Method for adding new project",response=Project.class)
    @RequestMapping(value = "/addproject", method = RequestMethod.POST,consumes = "application/json", produces = "application/json")
    public @ResponseBody
   Project project(@RequestBody Project project) {
       
    	Project e=(Project)dataServices.addproject(project);
  		return e;
     
    }
    
/*add Client*/
    
    @ApiOperation(value = "To add new Client",notes="Method for adding new Client",response=Client.class)
    @RequestMapping(value = "/addclient", method = RequestMethod.POST,consumes = "application/json", produces = "application/json")
    public @ResponseBody
   Client client(@RequestBody Client client) {
   	Client c=(Client)dataServices.addclient(client);
  	return c;
     
    }
    
 /*Login Employee*/
    
    @ApiOperation(value = "To Login",notes="Method for Login",response = Employee.class)
    @RequestMapping(value = "/Login/{id},{password}", method = RequestMethod.GET,produces = { MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE, })
   
    @ResponseBody 
    public  String getEmployee(@PathVariable Integer id,@PathVariable String password,HttpSession session)  {
    
     Employee employee = dataServices.getEmployeeById(id,password);
     System.out.println(employee);
       
    List<String> list=new ArrayList<String>();
	
    String role=employee.getRole();
    list.add(employee.getName());
    list.add(employee.getPassword());
    list.add(employee.getRole());
    
    session.setAttribute("name", employee.getName());
    session.setAttribute("id", id);
    session.setAttribute("address", employee.getAddress());
    session.setAttribute("role", role);
    session.setAttribute("name", employee.getName());
    session.setAttribute("skill", employee.getSkill());
    session.setAttribute("mail", employee.getEmail());
    
    String names="";
	int i=0;
	while(i<list.size())
    {
    	if(i<list.size()-1)
    		names+=list.get(i)+",";
    	else
    		names+=list.get(i);
    	i++;
    }
    
    System.out.println(names);
    return names;

    }
    
    
    
 /*Login Employee*/
    
    @ApiOperation(value = "Profile Details",notes="Method for Profile Info",response = Employee.class)
    @RequestMapping(value = "/profile/{id}", method = RequestMethod.GET,produces = { MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE, })
   
    @ResponseBody 
    public  String getProfile(@PathVariable Integer id,HttpSession session)  {
    
     Employee employee = dataServices.getProfile(id);
     System.out.println(employee);
       
    List<String> list=new ArrayList<String>();
	
    String role=employee.getRole();
    
    list.add(employee.getName());
    list.add(employee.getEmail());
    list.add(employee.getRole());
    list.add(employee.getAddress());
    list.add(employee.getSkill());
    
                                              
    
    session.setAttribute("id", id);
    session.setAttribute("role", role);
    session.setAttribute("name", employee.getName());
    
    String names="";
	int i=0;
	while(i<list.size())
    {
    	if(i<list.size()-1)
    		names+=list.get(i)+",";
    	else
    		names+=list.get(i);
    	i++;
    }
    
    System.out.println(names);
    return names;

    }
    
    
    
    
    
    
 
    /*get employee all employee details*/
    @ApiOperation(value = "Gets all the Employees", notes = "Retrieves all Employees details", response = Employee.class, responseContainer = "List")
    @RequestMapping(method = RequestMethod.GET, produces = { MediaType.APPLICATION_XML_VALUE,
	    MediaType.APPLICATION_JSON_VALUE }, value = "employees")
    @ResponseBody
    public EmployeeList getEmployees()
    {
    	System.out.println(dataServices.getEmployees());
	return new EmployeeList(new ArrayList<Employee>(dataServices.getEmployees()));
    }
    
    
    
    
    
    
    /*get all task details*/
    @ApiOperation(value = "Gets all the task", notes = "Retrieves all Task details", response = AssignTask.class, responseContainer = "List")
    @RequestMapping(value = "/viewtask/{date},{id}",method = RequestMethod.GET, produces = { MediaType.APPLICATION_XML_VALUE,
    MediaType.APPLICATION_JSON_VALUE })
    @ResponseBody
    public Assignlist getTask( @PathVariable String date,@PathVariable Integer id)
    {
    	System.out.println(dataServices.getTask(date,id));
	return new Assignlist(new ArrayList<AssignTask>(dataServices.getTask(date,id)));
    }

    
    
    
    
    /*delete employee detail by id*/
    @ApiOperation(value = "To delete Employee By Id",notes="Method for delete employee Details by Id",response = Employee.class)
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET,produces = { MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE })
    @ResponseBody 
    public String deleteEmployee(@PathVariable Integer id) {
    
    	try{
     dataServices.deleteEmployeeById(id);
     return "employee detail deletded ";
       	}
    	catch (Exception e) {
			System.out.println(e);
		}
        return "employee detail not fetched";
    }
        
    /*update partial record*/
    @ApiOperation(value = "Updates a Employee partially based on Employee id", notes = "Partially updates a employee", response = Employee.class)
    @RequestMapping(method = RequestMethod.PATCH, consumes = { MediaType.APPLICATION_XML_VALUE,
	    MediaType.APPLICATION_JSON_VALUE }, produces = { MediaType.APPLICATION_XML_VALUE,
		    MediaType.APPLICATION_JSON_VALUE }, value = "customers/{id}")
    public @ResponseBody Employee updatePartialCustomer(@PathVariable("id") Integer id,
	    @RequestBody Employee employee) {
	Employee emp;
	try {
		emp = dataServices.updatePartialEmployee(id, employee);
		return emp;
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	return null;
    }
}
