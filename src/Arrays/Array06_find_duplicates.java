package Arrays;

public class Array06_find_duplicates {
	
	public static void main(String[] args) {
		
		int[] arr = {10, 20, 10, 30, 20, 40};
		
		 System.out.print("Duplicate elements: ");

	        for (int i = 0; i < arr.length; i++) {

	            for (int j = i + 1; j < arr.length; j++) {

	                if (arr[i] == arr[j]) {

	                    System.out.print(arr[i] + " ");
	                    break;
	                }
	            }
	        }
		
	}

}
