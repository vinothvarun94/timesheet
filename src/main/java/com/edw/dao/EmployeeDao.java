package com.edw.dao;

import java.util.List;

import com.edw.spring4swagger.bean.AssignTask;
import com.edw.spring4swagger.bean.Client;
import com.edw.spring4swagger.bean.Employee;
import com.edw.spring4swagger.bean.Project;
import com.edw.spring4swagger.bean.TimeSheet;

public interface EmployeeDao {

	public Employee addEmployee(Employee employee) throws Exception;
	
	public Employee getEmployeeById(Integer id,String password)throws Exception;

	List<Employee> getEmployees();

	public boolean deleteEmployeeById(Integer id)throws Exception;

	public Employee updatePartialEmployee(Integer id, Employee employee)throws Exception ;
	
	public AssignTask assigntask(AssignTask assigntask);

	public Project addproject(Project project);

	public TimeSheet timesheet(TimeSheet timesheet);

	public Client addclient(Client client);

	public List<AssignTask> getTask(String date,Integer id);

	public Employee getProfile(Integer id);

}
