package com.string.practice;

class A {
	 char c = 'A';

	char getValue() {
		return c;
	}
}

class B extends A {
	 char c = 'B';

	char getValue() {
		return c;
	}

	char getSuperValue() {
		return super.c;
	}
}

public class p3 {
	public static void main(String[] args) {
		A a = new B();
		B b = new B();

		System.out.println(a.c + " " + a.getValue() + " " + b.getValue() + " " + b.getSuperValue());
	}
}
