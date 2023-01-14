package com.gitHub.teamD;

public class FarhadsClass {

	public static void main(String[] args) {

		boolean r1 = SleepIn(false, false);
		boolean r2 = SleepIn(true, false);

		System.out.println(r1);
		System.out.println(r2);
		
		FarhadsClass obj = new FarhadsClass();
		
		System.out.println(obj.reverse("Reverse this String"));

	}

	public static boolean SleepIn(boolean isWeekday, boolean isVacation) {

		boolean result = true;

		if (!isWeekday || isVacation) {
			result = false;

		}

		return result;

	}
	
	public String reverse(String str) {
		
		String result = "";
		
		char[] strArr = str.toCharArray();
		
		for (int i = strArr.length - 1; i >= 0; i--) {
			
			result += strArr[i];
		}
		
		return result;
	}
}

