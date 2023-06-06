package in.ineuron.in;

import java.util.Arrays;

public class MergeSort {

	    public static void mergeSort(int[] array) {
	        if (array == null || array.length <= 1) {
	            return; 
	        }

	        int middle = array.length / 2;
	        int[] left = new int[middle];
	        int[] right = new int[array.length - middle];

	      
	        System.arraycopy(array, 0, left, 0, middle);
	        System.arraycopy(array, middle, right, 0, array.length - middle);

	
	        mergeSort(left);
	        mergeSort(right);

	      
	        merge(left, right, array);
	    }

	    private static void merge(int[] left, int[] right, int[] result) {
	        int i = 0; 
	        int j = 0; 
	        int k = 0; 

	     
	        while (i < left.length && j < right.length) {
	            if (left[i] <= right[j]) {
	                result[k] = left[i];
	                i++;
	            } else {
	                result[k] = right[j];
	                j++;
	            }
	            k++;
	        }

	      
	        while (i < left.length) {
	            result[k] = left[i];
	            i++;
	            k++;
	        }

	       
	        while (j < right.length) {
	            result[k] = right[j];
	            j++;
	            k++;
	        }
	    }

	    public static void main(String[] args) {
	        int[] array = {5, 2, 8, 12, 1, 6, 3, 9};
	        System.out.println("Original array: " + Arrays.toString(array));

	        mergeSort(array);
	        System.out.println("Sorted array: " + Arrays.toString(array));
	    }
	}


