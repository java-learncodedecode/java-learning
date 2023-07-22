package com.dev.java8;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEmployeeMapByColumn {

	public static void main(String[] args) {
		// Create a HashMap of Employee objects
		Map<String, Employee> employeeMap = new HashMap<>();
		employeeMap.put("ID1", new Employee("ABC", 50000, 30));
		employeeMap.put("ID2", new Employee("XYZ", 51000, 50));
		employeeMap.put("ID3", new Employee("PQR", 150000, 20));
		employeeMap.put("ID4", new Employee("MNP", 20000, 60));
		employeeMap.put("ID5", new Employee("PQR", 80000, 40));

		// Group employees by department
		Map<String, List<Employee>> employeesByDepartment = employeeMap.values().stream()
				.collect(Collectors.groupingBy(Employee::getName));

		// Display employees grouped by department
		employeesByDepartment.forEach((name, empList) -> {
			empList.forEach(System.out::println);
			System.out.println();
		});
	}

}
