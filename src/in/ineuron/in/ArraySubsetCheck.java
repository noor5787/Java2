package in.ineuron.in;
import java.util.Arrays;
public class ArraySubsetCheck {
	

	
	    public static void main(String[] args) {
	        int[] array1 = {1, 2, 3, 4, 5};
	        int[] array2 = {2, 4, 5};

	        if (isSubset(array1, array2)) {
	            System.out.println("Array2 is a subset of Array1");
	        } else {
	            System.out.println("Array2 is not a subset of Array1");
	        }
	    }

	    public static boolean isSubset(int[] array1, int[] array2) {
	        if (array1.length < array2.length) {
	            return false;
	        }

	        Arrays.sort(array1);
	        Arrays.sort(array2);

	        int i = 0;
	        int j = 0;

	        while (i < array1.length && j < array2.length) {
	            if (array1[i] < array2[j]) {
	                i++;
	            } else if (array1[i] == array2[j]) {
	                i++;
	                j++;
	            } else {
	                return false;
	            }
	        }

	        return (j == array2.length);
	    }
	}


