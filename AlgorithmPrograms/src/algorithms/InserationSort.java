package algorithms;

import java.util.Scanner;

public class InserationSort {
	    public static void main(String[] args) {
	        String[] words = readWords();
	        insertionSort(words);
	        System.out.println("Sorted List:");
	        printArray(words);
	    }

	    private static String[] readWords() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of words: ");
	        int numWords = scanner.nextInt();
	        scanner.nextLine();
	        System.out.println("Enter the words:");

	        String[] words = new String[numWords];
	        for (int i = 0; i < numWords; i++) {
	            words[i] = scanner.nextLine();
	        }

	        return words;
	    }
       private static void insertionSort(String[] arr) {
	        int n = arr.length;

	        for (int i = 1; i < n; ++i) {
	            String key = arr[i];
	            int j = i - 1;
	            while (j >= 0 && arr[j].compareTo(key) > 0) {
	                arr[j + 1] = arr[j];
	                j = j - 1;
	            }
	            arr[j + 1] = key;
	        }
	    }

	    private static void printArray(String[] arr) {
	        for (String word : arr) {
	            System.out.println(word);
	        }
	    }
	}

