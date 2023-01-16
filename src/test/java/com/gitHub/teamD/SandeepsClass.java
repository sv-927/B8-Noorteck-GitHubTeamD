package com.gitHub.teamD;

public class SandeepsClass extends LubnaWasHere {

	public static void main(String[] args) {

		System.out.println("I love Java");

		SandeepsClass obj = new SandeepsClass();

		System.out.println(obj.toUpperCase("I love Java"));

		System.out.println(toLowerCase("I LOVE JAVA"));

		System.out.println(obj.addFive(1, 99, 130));

		System.out.println(priceTotal(29.99, 40.50));

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

	static double priceTotal(double a, double b) {

		return a + b;
	
	
	
	
	}
	public static boolean isPrime(int n) {
	    if (n <= 1) {
	        return false;
	    }
	    for (int i = 2; i < n; i++) {
	        if (n % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}
	
	public static void names() {
		
		System.out.println("John Cena");
		System.out.println("Jackie Chan");
		System.out.println("John Smith");
		System.out.println("John Lennon");
		System.out.println("Johnny Depp");
		System.out.println("John F. Kennedy);
		System.out.println("John Travolta");
				   
	}

}
