package javaPrograms;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramCheck {
	
	    public static void main(String[] args) {
	        // Get input from the user
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a sentence: ");
	        String input = scanner.nextLine();
	        scanner.close();

	        // Check if the input is a pangram
	        boolean isPangram = checkPangram(input);

	        // Display the result
	        if (isPangram) {
	            System.out.println("The input is a pangram.");
	        } else {
	            System.out.println("The input is not a pangram.");
	        }
	    }

	    public static boolean checkPangram(String input) {
	        // Convert the input to lowercase to make the comparison case-insensitive
	        String lowercaseInput = input.toLowerCase();

	        // Create a set to store the unique lowercase alphabets present in the input
	        Set<Character> alphabetSet = new HashSet<>();

	        // Iterate through each character in the input
	        for (char c : lowercaseInput.toCharArray()) {
	            // Check if the character is an alphabet and add it to the set
	            if (Character.isAlphabetic(c)) {
	                alphabetSet.add(c);
	            }
	        }
	        // Check if the set size is 26, indicating that all alphabets are present
	        return alphabetSet.size() == 26;
	    }
	}

