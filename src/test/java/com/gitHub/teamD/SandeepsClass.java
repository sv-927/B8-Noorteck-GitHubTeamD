package com.gitHub.teamD;

public class SandeepsClass {
	
	public static void main(String[] args) {
		
		System.out.println("I love Java");
		
		SandeepsClass obj = new SandeepsClass();
		
		System.out.println(obj.toUpperCase("I love Java"));
		
		System.out.println(toLowerCase("I LOVE JAVA"));
		
		System.out.println(obj.addFive(1, 99, 130));
		
	}
	
	public String toUpperCase(String str) {
		
		return str.toUpperCase();
	}
	
	public static String toLowerCase(String str) {
		
		return str.toLowerCase();
	}
	
	private int addFive(int a, int b, int c) {
		
		return a + b + c + 5;
	}

}