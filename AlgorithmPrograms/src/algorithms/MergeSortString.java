package algorithms;
import java.util.Arrays;
import java.util.Scanner;

public class MergeSortString {
	    public static void main(String[] args) {
	        String[] arr = {"banana", "apple", "orange", "grape", "kiwi"};
	        System.out.println("Original Array: " + Arrays.toString(arr));

	        mergeSort(arr, 0, arr.length);

	        System.out.println("Sorted Array: " + Arrays.toString(arr));
	    }

	    public static void mergeSort(String[] arr, int lo, int hi) {
	        if (hi - lo > 1) {
	            int mid = lo + (hi - lo) / 2;
	            mergeSort(arr, lo, mid);
	            mergeSort(arr, mid, hi);
	            merge(arr, lo, mid, hi);
	        }
	    }

	    public static void merge(String[] arr, int lo, int mid, int hi) {
	        int leftLength = mid - lo;
	        int rightLength = hi - mid;

	        String[] leftArray = new String[leftLength];
	        String[] rightArray = new String[rightLength];

	        System.arraycopy(arr, lo, leftArray, 0, leftLength);
	        System.arraycopy(arr, mid, rightArray, 0, rightLength);

	        int i = 0, j = 0, k = lo;

	        while (i < leftLength && j < rightLength) {
	            if (leftArray[i].compareTo(rightArray[j]) < 0) {
	                arr[k++] = leftArray[i++];
	            } else {
	                arr[k++] = rightArray[j++];
	            }
	        }
	        while (i < leftLength) {
	            arr[k++] = leftArray[i++];
	        }

	        while (j < rightLength) {
	            arr[k++] = rightArray[j++];
	        }
	    }
	}
