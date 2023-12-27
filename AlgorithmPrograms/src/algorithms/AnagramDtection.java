package algorithms;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramDtection {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the first string: ");
	        String str1 = scanner.next();
	        System.out.print("Enter the second string: ");
	        String str2 = scanner.next();

	        if (areAnagrams(str1, str2)) {
	            System.out.println("The two strings are Anagrams.");
	        } else {
	            System.out.println("The two strings are NOT Anagrams.");
	        }
	    }
	    
	    private static boolean areAnagrams(String str1, String str2) {
	        str1 = str1.replaceAll("\\s", "").toLowerCase();
	        str2 = str2.replaceAll("\\s", "").toLowerCase();
	        if (str1.length() != str2.length()) {
	            return false;
	        }
	        
	        char[] charArray1 = str1.toCharArray();
	        char[] charArray2 = str2.toCharArray();
	        Arrays.sort(charArray1);
	        Arrays.sort(charArray2);
	        return Arrays.equals(charArray1, charArray2);
	    }
	}

