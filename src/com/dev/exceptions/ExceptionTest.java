package com.dev.exceptions;

public class ExceptionTest {
/*
 *  1. DeB
 */
	public static void main(String[] args) {

		ExceptionTest et = null;
		try {
			et.doWork();
		} catch (NullPointerException npe) {
			npe.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void doWork() {
		System.out.println("Throw some error");
	}

}
