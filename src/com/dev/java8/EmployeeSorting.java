package com.dev.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeSorting {

	    public static void main(String[] args) {
	        // Create a list of employees
	        List<Employee> employeeList = new ArrayList<>();
	        employeeList.add(new Employee("John Doe", 50000, 30));
	        employeeList.add(new Employee("Jane Smith", 60000, 25));
	        employeeList.add(new Employee("Mark Tailor", 45000, 55));
	        employeeList.add(new Employee("Mark Tailor", 45000, 45));

	        List<Employee> sortedList = employeeList.stream()
	        	    .sorted(Comparator.comparing(Employee::getName)
	        	        .thenComparingDouble(Employee::getSalary)
	        	        .thenComparingInt(Employee::getAge))
	        	    .collect(Collectors.toList());
	        sortedList.forEach(employee -> System.out.println("Name: " + employee.getName() + ", Salary: " + employee.getSalary() + ", Age: " + employee.getAge()));
  		
	        		
	        		//employeeList.stream()
	               // .collect(Collectors.groupingBy(EmployeedetailsSort::getDepartment));
	    }
	}
