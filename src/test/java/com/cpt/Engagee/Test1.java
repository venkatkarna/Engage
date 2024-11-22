package com.cpt.Engagee;

public class Test1 {

	public static void main(String[] args) {
		
		int number = 101;
		boolean isPalindrome = isPalindrome(number);
		System.out.println("Is that number is " + number + " palindorme or not? "+ isPalindrome);
		
	}

	public static boolean isPalindrome(int number) {
		int original = number;
		int reverse = 0;
		
		for (int n = number; n !=0; n/=10) {
			int digit = n%10;
			reverse = reverse *10 + digit;
		}
		
		return reverse == number;
	}
}
