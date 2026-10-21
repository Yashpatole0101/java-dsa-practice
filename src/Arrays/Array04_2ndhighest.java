package Arrays;

public class Array04_2ndhighest {

	public static void main(String[] args) {
		int num=Integer.MIN_VALUE;
		
		int second=0;
		
		
		int[] arr= {10,75,56,23,98,50,12};
		
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>num) {
				second=num;
				num=arr[i];
			}
			
			if(arr[i]>second && arr[i]<num) {
				second=arr[i];
			}
		}
		
		System.out.println(second);

	}

}
