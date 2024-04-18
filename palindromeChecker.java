/*Write a Java method to check if an input string is a 
 * palindrome (Use String functions).*/
package javaAssignment4;

public class palindromeChecker {
	
	    public static void main(String[] args) {
	        String inputString = "Nitin";
	        boolean isPalindrome = isPalindrome(inputString);
	        if (isPalindrome) {
	            System.out.println(inputString + " is a palindrome.");
	        } else {
	            System.out.println(inputString + " is not a palindrome.");
	        }
	    }

	    public static boolean isPalindrome(String str) {
	        
	        str = str.toLowerCase();
	        
	        
	        str = str.replaceAll("[^a-z0-9]", "");
	        
	        
	        String reversedStr = new StringBuilder(str).reverse().toString();
	        
	        
	        return str.equals(reversedStr);
	    }
}


