package com.cpt.payments.controller;
import org.springframework.web.bind.annotation.*;

import com.cpt.payments.pojo.Employee;
import com.cpt.payments.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/c3")
public class EmployeeController {

    private EmployeeService employeeService = new EmployeeService();

	// Retrieve all employees
    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    // Retrieve a specific employee by ID
    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return employeeService.getEmployeeById(id);
    }

    // Create a new employee
    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }

    // Update an existing employee
    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@PathVariable int id, @RequestBody Employee updatedEmployee) {
        return employeeService.updateEmployee(id, updatedEmployee);
    }

    // Delete an employee by ID
    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable int id) {
        employeeService.deleteEmployee(id);
    }
}
