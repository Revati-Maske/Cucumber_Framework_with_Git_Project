package com.basic;

public class StringReverse {

	public static void main(String[] args) {
		String str1 = "12321";
		String str2 = "";
		for(int i= str1.length()-1; i>=0; i--) {
			// for String reverse
			//System.out.print(str1.charAt(i));
			
			// for checking palindrome
			str2 = str2+str1.charAt(i);
		}
		if(str1.equals(str2)) {
		System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
	}

}
