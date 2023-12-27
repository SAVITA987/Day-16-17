package algorithms;

import java.util.Arrays;

	public class AnagramPalindromePrimes {
	    public static void main(String[] args) {
	        int lowerLimit = 1;
	        int upperLimit = 1000;

	        System.out.println("Prime numbers that are both Anagrams and Palindromes in the range " +
	                lowerLimit + " to " + upperLimit + ":");

	        for (int i = lowerLimit; i <= upperLimit; i++) {
	            if (isPrime(i) && isAnagramPalindrome(i)) {
	                System.out.println(i);
	            }
	        }
	    }

	    private static boolean isPrime(int number) {
	        if (number <= 1) {
	            return false;
	        }

	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) {
	                return false;
	            }
	        }

	        return true;
	    }

	    private static boolean isAnagramPalindrome(int number) {
	        String strNumber = Integer.toString(number);
	        if (isPalindrome(strNumber)) {
	            int[] anagramPrimes = generateAnagramPrimes(number);
	            return Arrays.binarySearch(anagramPrimes, number) >= 0;
	        }

	        return false;
	    }
	    private static boolean isPalindrome(String str) {
	        return str.equals(new StringBuilder(str).reverse().toString());
	    }
	    private static int[] generateAnagramPrimes(int number) {
	        int count = 0;
	        int[] anagramPrimes = new int[10];

	        for (int i = number + 1; count < 10; i++) {
	            if (isPrime(i) && areAnagrams(number, i)) {
	                anagramPrimes[count++] = i;
	            }
	        }

	        return anagramPrimes;
	    }
	    private static boolean areAnagrams(int num1, int num2) {
	        String str1 = Integer.toString(num1);
	        String str2 = Integer.toString(num2);

	        char[] charArray1 = str1.toCharArray();
	        char[] charArray2 = str2.toCharArray();

	        Arrays.sort(charArray1);
	        Arrays.sort(charArray2);

	        return Arrays.equals(charArray1, charArray2);
	    }
	}

