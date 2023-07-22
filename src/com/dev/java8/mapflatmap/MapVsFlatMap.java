package com.dev.java8.mapflatmap;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {

	public static void main(String[] args) {

		List<Customer> customers = CustomerDetails.getAll();

		List<String> emails = customers.stream().map(e -> e.getEmail()).collect(Collectors.toList());
		System.out.println("Customer Emails after mapping : " + emails);

		System.out.println("list phone numbers using map :");
		List<List<String>> phoneNumbersMap = customers.stream().map(customer -> customer.getPhoneNumbers())
				.collect(Collectors.toList());
		System.out.println(phoneNumbersMap);

		// list phone numbers using flatmap
		System.out.println("list phone numbers using flatmap :");
		List<String> phoneNubmersFlatMap = customers.stream().flatMap(e -> e.getPhoneNumbers().stream())
				.collect(Collectors.toList());
		System.out.println(phoneNubmersFlatMap);

	}
}