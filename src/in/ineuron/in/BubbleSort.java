package in.ineuron.in;
import java.util.Arrays;


public class BubbleSort {

	    public static void main(String[] args) {
	        int[] array = {5, 3, 8, 4, 2};

	        System.out.println("Original array: " + Arrays.toString(array));

	        bubbleSort(array);

	        System.out.println("Sorted array: " + Arrays.toString(array));
	    }

	    public static void bubbleSort(int[] array) {
	        int n = array.length;
	        boolean swapped;

	        for (int i = 0; i < n - 1; i++) {
	            swapped = false;
	            for (int j = 0; j < n - i - 1; j++) {
	                if (array[j] > array[j + 1]) {
	                    // Swap array[j] and array[j + 1]
	                    int temp = array[j];
	                    array[j] = array[j + 1];
	                    array[j + 1] = temp;
	                    swapped = true;
	                }
	            }

	            // If no two elements were swapped in the inner loop, the array is already sorted
	            if (!swapped) {
	                break;
	            }
	        }
	    }
	}


