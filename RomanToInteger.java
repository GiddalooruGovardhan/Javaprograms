package javaPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class RomanToInteger {

	    public static void main(String[] args) {
	        // Test with a Roman numeral
	    	Scanner scn=new Scanner(System.in);
	    	System.out.println("Enter the roman number");
	        String romanNumeral = scn.next();

	        // Convert Roman numeral to integer
	        int result = romanToInt(romanNumeral);

	        // Print the result
	        System.out.println("The integer value of " + romanNumeral + " is: " + result);
	        scn.close();
	    }

	    public static int romanToInt(String s) {
	        // Create a map to store the values of Roman numerals
	        Map<Character, Integer> romanValues = new HashMap<>();
	        romanValues.put('I', 1);
	        romanValues.put('V', 5);
	        romanValues.put('X', 10);
	        romanValues.put('L', 50);
	        romanValues.put('C', 100);
	        romanValues.put('D', 500);
	        romanValues.put('M', 1000);

	        int result = 0;

	        // Iterate through the characters of the Roman numeral string
	        for (int i = 0; i < s.length(); i++) {
	            // Get the value of the current Roman numeral character
	            int currentValue = romanValues.get(s.charAt(i));

	            // If the next Roman numeral is larger, subtract the current value
	            // Otherwise, add the current value to the result
	            if (i < s.length() - 1 && romanValues.get(s.charAt(i + 1)) > currentValue) {
	                result -= currentValue;
	            } else {
	                result += currentValue;
	            }
	        }

	        return result;
	    }
	}


