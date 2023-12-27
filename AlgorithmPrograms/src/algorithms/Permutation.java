package algorithms;
import java.util.Arrays;

public class Permutation {
	   public static String[] generatePermutationsIterative(String str) {
	        int n = str.length();
	        int factorial = factorial(n);

	        String[] permutations = new String[factorial];
	        permutations[0] = str;

	        for (int i = 1; i < factorial; i++) {
	            str = getNextPermutation(str);
	            permutations[i] = str;
	        }

	        return permutations;
	    }

	    private static String getNextPermutation(String str) {
			return null;
		}

	    public static String[] generatePermutationsRecursive(String str) {
	        int n = str.length();
	        int factorial = factorial(n);

	        String[] permutations = new String[factorial];
	        char[] chars = str.toCharArray();

	        generateRecursiveHelper(chars, n, permutations, 0);

	        return permutations;
	    }

	    private static void generateRecursiveHelper(char[] chars, int n, String[] permutations, int index) {
	        if (index == n - 1) {
	            permutations[index] = new String(chars);
	        } else {
	            for (int i = index; i < n; i++) {
	                swap(chars, index, i);
	                generateRecursiveHelper(chars, n, permutations, index + 1);
	                swap(chars, index, i); // Backtrack
	            }
	        }
	    }

	    private static void swap(char[] chars, int i, int j) {
	        char temp = chars[i];
	        chars[i] = chars[j];
	        chars[j] = temp;
	    }

	    private static int factorial(int n) {
	        if (n <= 1) {
	            return 1;
	        }
	        return n * factorial(n - 1);
	    }

	    public static boolean areArraysEqual(String[] arr1, String[] arr2) {
	        return Arrays.equals(arr1, arr2);
	    }

	    public static void main(String[] args) {
	        String inputString = "abc";

	        String[] iterativePermutations = generatePermutationsIterative(inputString);
	        System.out.println("Iterative Permutations: " + Arrays.toString(iterativePermutations));

	        String[] recursivePermutations = generatePermutationsRecursive(inputString);
	        System.out.println("Recursive Permutations: " + Arrays.toString(recursivePermutations));

	        boolean areEqual = areArraysEqual(iterativePermutations, recursivePermutations);
	        System.out.println("Are the arrays equal? " + areEqual);
	    }
	}

