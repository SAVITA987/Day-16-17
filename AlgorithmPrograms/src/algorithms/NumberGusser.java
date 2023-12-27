package algorithms;

import java.util.Scanner;

public class NumberGusser {
         public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        if (args.length != 1) {
	            System.out.println("Usage: java NumberGuesser <N>");
	            return;
	        }

	        int N = Integer.parseInt(args[0]);
	        int n = (int) (Math.log(N) / Math.log(2)); 
	        int low = 0;
	        int high = N - 1;
	        int guess;

	        for (int i = 0; i < n; i++) {
	            guess = (low + high) / 2;
	            System.out.println("Is the number between " + low + " and " + high + "?");
	            System.out.println("My guess: " + guess);
	            System.out.print("Enter 'true' if yes, 'false' if no: ");
	            boolean response = scanner.nextBoolean();

	            if (response) {
	                high = guess - 1;
	            } else {
	                low = guess + 1;
	            }
	        }
	        System.out.println("Your number is: " + low);
	    }
	}

