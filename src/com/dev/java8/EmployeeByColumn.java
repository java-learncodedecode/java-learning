package com.dev.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeByColumn {
	public static void main(String[] args) {
		// Sample list of employees
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("John Doe", 50000, 30));
        employeeList.add(new Employee("Jane Smith", 60000, 25));
        employeeList.add(new Employee("Mark Tailor", 45000, 55));
        employeeList.add(new Employee("Mark Tailor", 45000, 45));

		// Use Java 8 stream and Collectors.groupingBy to group employees by department
		Map<Double, List<Employee>> employeesBySalary = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getSalary));

		// Display employees grouped by department
		employeesBySalary.forEach((salary, empList) -> {
			System.out.println("Employee by Salary : " + salary);
			for (Employee employee : empList) {
				System.out.println(employee);
			}
			System.out.println();
		});
	}

}
