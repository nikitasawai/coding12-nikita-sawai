import java.util.Scanner;

public class Program11 {

	// Function to remove non-alphabetic characters
	static String removeNonAlphabetic(String str) {

		// Use regular expression to match all non-alphabetic characters and replace with empty string
		String result = str.replaceAll("[^a-zA-Z]", "");

		return result; // Return the resulting string
	}

	public static void main(String[] args) {

		String str = "Hello, how are you ?"; // Initialize a sample string
		String result = removeNonAlphabetic(str); // Call the removeNonAlphabetic function with input string
		System.out.println(result); // Print the resulting string with non-alphabetic characters removed
	}
}
