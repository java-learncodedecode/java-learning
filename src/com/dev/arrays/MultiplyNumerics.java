package com.java.dev;

public class MultiplyNumerics {

	public static void main(String[] args) {

		String input = "Abc";
		long output = 1L;
		boolean numberPresent = false;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch)) {
				output = output * (Character.getNumericValue(ch));
				numberPresent = true;
			}
		}
		if (!numberPresent)
			System.out.println("There are no number in string");
		else
			System.out.println("Output of number after multiply is :" + output);

		int output1 = input.chars().filter(Character::isDigit).map(Character::getNumericValue)
				.reduce((s1, s2) -> s1 * s2).orElse(0);
		System.out.println(output1);
	}

}