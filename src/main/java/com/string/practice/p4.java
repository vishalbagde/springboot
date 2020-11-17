package com.string.practice;

public class p4 {
static int num;
static String mystr;

// constructor
p4() {
num = 100;
mystr = "Constructor";
}

// First Static block
static {
System.out.println("Static Block 1");
num = 68;
mystr = "Block1";
}

// Second static block
static {
System.out.println("Static Block 2");
num = 98;
mystr = "Block2";
}

public static void main(String args[]) {
p4 a = new p4();
System.out.println("Value of num = " + a.num);
System.out.println("Value of mystr = " + a.mystr);
} }