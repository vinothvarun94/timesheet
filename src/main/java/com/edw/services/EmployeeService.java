package com.edw.services;
import java.util.Collection;
import java.util.List;

import com.edw.spring4swagger.bean.AssignTask;
import com.edw.spring4swagger.bean.Client;
import com.edw.spring4swagger.bean.Employee;
import com.edw.spring4swagger.bean.Project;
import com.edw.spring4swagger.bean.TimeSheet;
public interface EmployeeService {
	public Employee addEmployee(Employee employee);
	public Employee getEmployeeById(Integer id, String password);
	List<Employee> getEmployees();
	public boolean deleteEmployeeById(Integer id)throws  Exception;
	public Employee updatePartialEmployee(Integer id, Employee employee)throws Exception;
	public Employee login(Employee employee);
	public AssignTask assigntask(AssignTask assigntask);
	public Project addproject(Project project);
	public TimeSheet timesheet(TimeSheet timesheet);
	public Client addclient(Client client);
	List<AssignTask> getTask(String date,Integer id);
	public Employee getProfile(Integer id);
}
