package com.edw.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.edw.dao.EmployeeDao;
import com.edw.spring4swagger.bean.AssignTask;
import com.edw.spring4swagger.bean.Client;
import com.edw.spring4swagger.bean.Employee;
import com.edw.spring4swagger.bean.Project;
import com.edw.spring4swagger.bean.TimeSheet;
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	 EmployeeDao employeedao;

	@Override
	public Employee addEmployee(Employee employee) {
		try {
			employeedao.addEmployee(employee);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employee;		
	}

	@Override
	public List<Employee> getEmployees() {
		List<Employee> EmployeeList=  employeedao.getEmployees();
		return EmployeeList;
	}
	
	@Override
	public boolean deleteEmployeeById(Integer id) throws Exception {
		return employeedao.deleteEmployeeById(id);
	}
	@Override
	public Employee updatePartialEmployee(Integer id, Employee employee) throws Exception {
		Employee emp;
		try
		{
		emp=employeedao.updatePartialEmployee(id,employee);
		return emp;
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return null; 
	}
	

	@Override
	public Employee getEmployeeById(Integer id, String password) {
		Employee emp;
		try {
			emp = employeedao.getEmployeeById(id,password);
			return emp;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			System.out.println("to add new employee service");
	
		return null;
	
	}

	

	@Override
	public Employee login(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AssignTask assigntask(AssignTask assigntask) {
		try {
			employeedao.assigntask(assigntask);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return assigntask;	
	}

	@Override
	public Project addproject(Project project) {
		try {
			employeedao.addproject(project);
		} catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return project;
	}
	@Override
	public TimeSheet timesheet(TimeSheet timesheet) {
		try {
			employeedao.timesheet(timesheet);
		} catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return timesheet;
	}
	@Override
	public Client addclient(Client client) {
		try {
			employeedao.addclient(client);
		} catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return client;
	}

	@Override
	public List<AssignTask> getTask(String date,Integer id) {
		List<AssignTask> Assignlist=  employeedao.getTask(date,id);
		return Assignlist;
	}

	@Override
	public Employee getProfile(Integer id)
	{
		Employee emp;
		try {
			emp = employeedao.getProfile(id);
			return emp;
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			System.out.println("Getting Employee Data");
	
		return null;
	}

}
