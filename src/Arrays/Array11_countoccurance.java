package Arrays;

public class Array11_countoccurance {

	public static void main(String[] args) {
		int[] arr= {10,10,10,24,56,34,24,24};
		
		int search=10;
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==search) {
				count++;
			}
		}
		
		System.out.println("occurance of element "+search+" is "+count);

	}

}
