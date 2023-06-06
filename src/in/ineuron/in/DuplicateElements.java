package in.ineuron.in;
import java.util.HashMap;
import java.util.Map;

public class DuplicateElements {
	  public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5, 2, 7, 8, 5, 9, 4};

	        Map<Integer, Integer> frequencyMap = new HashMap<>();

	        // Counting the frequency of each element in the array
	        for (int num : arr) {
	            if (frequencyMap.containsKey(num)) {
	                frequencyMap.put(num, frequencyMap.get(num) + 1);
	            } else {
	                frequencyMap.put(num, 1);
	            }
	        }

	        // Printing duplicate elements
	        System.out.println("Duplicate elements in the array are:");
	        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
	            if (entry.getValue() > 1) {
	                System.out.println(entry.getKey());
	            }
	        }
	    }
	}


