package com.dev.patient;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PatientTest {

	public static void main(String[] args) {

		Patient p1 = new Patient("a1", 21, "corona", 10000.00);
		Patient p2 = new Patient("a2", 24, "diarrea", 19000.00);
		Patient p5 = new Patient("a5", 29, "corona", 15010.00);
		Patient p3 = new Patient("a3", 26, "corona", 10500.00);
		Patient p4 = new Patient("a4", 29, "viral", 15010.00);

		List<Patient> patients = Arrays.asList(p1, p2, p3, p4, p5);
		// patients.stream().filter(p-> p.getDesease().equalsIgnoreCase("corona") &&
		// p.getAge() < 25).map(p->p.getName()).forEach(System.out::println);
		Double avgBillPaid = patients.stream().filter(p -> p.getDesease().equalsIgnoreCase("corona"))
				.collect(Collectors.averagingDouble(Patient::getBillAmount));
		System.out.println("Average bill paid by coroa patients :" + avgBillPaid);
	}

}
