package com.dev.test;

public class Factorial {

	public static void main(String[] args) throws Exception {
		int n = -5;
		int factorial = factorialOfNumber(n);
		System.out.println("factorial of num is :" +factorial);
	}

	static int factorialOfNumber(int num) throws Exception{

		
		if(num<=0) {
			throw new FactoialOfNumberNotDefined("Factorial of " +num+ " is not defined");
		}
		if (num == 1)
			return 1;

		return num * factorialOfNumber(num - 1);

	}

}
class FactoialOfNumberNotDefined extends Exception{
	FactoialOfNumberNotDefined(String s){
		super(s);
		
	}
}
