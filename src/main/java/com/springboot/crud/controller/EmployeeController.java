package com.springboot.crud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.crud.dao.EmployeeDao;
import com.springboot.crud.model.Employee;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeDao empDao;
	
	@RequestMapping("/home")
	public String Home() {
		return "home";
	}
	
	@RequestMapping("/addEmp")
	public String AddEmp(Employee emp) {
		empDao.createEmployee(emp);
		return "redirect:/getAllEmps";
	}
	
	@RequestMapping("/searchEmpById")
	public String EmployeeById(Model theModel, @RequestParam int empId) {
		Optional<Employee> employee = empDao.searchEmployeeById(empId);
		theModel.addAttribute("employee", employee);
		return "searchempbyid";
	}
	
	@RequestMapping("/getAllEmps")
	public String ListEmployee(Model theModel) {
		List<Employee> employee = empDao.getAllEmp();
		theModel.addAttribute("employee", employee);
		return "getallemps";
	}
	
	@RequestMapping("/deleteEmp")
	public String DeleteEmp(@RequestParam("empId") int empId) {
		empDao.deleteEmployee(empId);
		return "redirect:/getAllEmps";
	}
	
	@GetMapping("/updateForm")
	public String showFormForUpdate(@RequestParam("empId") int empId,
									Model theModel){
		Optional<Employee> employee = empDao.searchEmployeeById(empId);	
		theModel.addAttribute("employee", employee);
		return "editemp";
	}
}
