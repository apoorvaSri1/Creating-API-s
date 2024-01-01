package com.cpt.payments.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cpt.payments.pojo.Employee;
import com.cpt.payments.utils.Utility;

public class EmployeeService {
	
	public Map<Integer, Employee> employeeCache = new HashMap<Integer, Employee>();

	public List<Employee> getAllEmployees() {
		return new ArrayList<>(employeeCache.values());
	}

	public Employee getEmployeeById(int id) {
		return employeeCache.get(id);
	}

	public Employee createEmployee(Employee employee) {
		Employee emp = new Employee();
		emp.setId(Utility.empIdSeq.incrementAndGet());
		emp.setName(employee.getName());
		emp.setEmail(employee.getEmail());

		employeeCache.put(emp.getId(), emp);
 
		System.out.println("updateEmployee:" + emp);
		return emp;
	}

	public Employee updateEmployee(int id, Employee updatedEmployee) {
		Employee cachedEmp = employeeCache.get(id);
		if (cachedEmp == null) {
			return null;
		}
		
		cachedEmp.setName(updatedEmployee.getName());
		cachedEmp.setEmail(updatedEmployee.getEmail());
		
		System.out.println("updateEmployee:" + cachedEmp);
		return cachedEmp;
	}

	public void deleteEmployee(int id) {
		Employee removedEmp = employeeCache.remove(id);
		System.out.println("removedEmp:" + removedEmp);
	}

}
