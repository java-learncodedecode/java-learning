package com.dev.randoms;

public class FinalVsPrivate {

	public final String hello() {
		return "hello final method";

	}

	private String hello1() {
		return "hello private method";
	}

}

class Main extends FinalVsPrivate {
	private String hello1() {
		return "hello private method";

	}
}