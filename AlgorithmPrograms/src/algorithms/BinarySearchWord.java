package algorithms;
import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

	public class BinarySearchWord {

	    public static void main(String[] args) {
	        try {
	            // Read words from file
	            String[] words = readWordsFromFile("wordList.txt");

	            // Sort the array of words
	            Arrays.sort(words);

	            // Prompt the user to enter a word to search
	            String searchWord = getUserInput("Enter a word to search: ");

	            // Perform binary search
	            boolean isFound = binarySearch(words, searchWord);

	            // Print the result
	            if (isFound) {
	                System.out.println("The word '" + searchWord + "' is found in the list.");
	            } else {
	                System.out.println("The word '" + searchWord + "' is not found in the list.");
	            }

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    private static String[] readWordsFromFile(String fileName) throws IOException {
	        BufferedReader reader = new BufferedReader(new FileReader(fileName));
	        String line = reader.readLine();
	        reader.close();
	        return line.split(",");
	    }

	    private static String getUserInput(String prompt) throws IOException {
	        BufferedReader reader = new BufferedReader(new java.io.InputStreamReader(System.in));
	        System.out.print(prompt);
	        return reader.readLine();
	    }

	    private static boolean binarySearch(String[] words, String searchWord) {
	        int left = 0;
	        int right = words.length - 1;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;
	            int comparisonResult = searchWord.compareTo(words[mid]);

	            if (comparisonResult == 0) {
	                return true; // Word found
	            } else if (comparisonResult < 0) {
	                right = mid - 1; // Search in the left half
	            } else {
	                left = mid + 1; // Search in the right half
	            }
	        }

	        return false; // Word not found
	    }
	}
