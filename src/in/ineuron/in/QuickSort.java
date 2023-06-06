package in.ineuron.in;

public class QuickSort {
	
	    
	    public static void main(String[] args) {
	        int[] array = {9, 5, 1, 8, 3, 7, 6, 2, 4};
	        
	        System.out.println("Original array:");
	        printArray(array);
	        
	        quickSort(array, 0, array.length - 1);
	        
	        System.out.println("Sorted array:");
	        printArray(array);
	    }
	    
	    public static void quickSort(int[] array, int low, int high) {
	        if (low < high) {
	            // Partition the array, and get the pivot index
	            int pivotIndex = partition(array, low, high);
	            
	            // Recursively sort the sub-arrays before and after the pivot
	            quickSort(array, low, pivotIndex - 1);
	            quickSort(array, pivotIndex + 1, high);
	        }
	    }
	    
	    public static int partition(int[] array, int low, int high) {
	        // Choose the rightmost element as the pivot
	        int pivot = array[high];
	        
	        // Index of the smaller element
	        int i = low - 1;
	        
	        // Iterate through the array from low to high-1
	        for (int j = low; j < high; j++) {
	            // If the current element is smaller than or equal to the pivot,
	            // swap arr[i] and arr[j]
	            if (array[j] <= pivot) {
	                i++;
	                swap(array, i, j);
	            }
	        }
	        
	        // Swap the pivot element with the element at index i+1
	        swap(array, i + 1, high);
	        
	        // Return the partition index
	        return i + 1;
	    }
	    
	    public static void swap(int[] array, int i, int j) {
	        int temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	    }
	    
	    public static void printArray(int[] array) {
	        for (int element : array) {
	            System.out.print(element + " ");
	        }
	        System.out.println();
	    }
	}


