package Arrays;

public class Array05_secondlowest {

	public static void main(String[] args) {
		int num=Integer.MAX_VALUE;
		
		int second=Integer.MAX_VALUE;
		
		int[] arr= {92,89,75,65,45,23};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<num) {
				second=num;
				num=arr[i];
			}
			
			if(arr[i]<second && arr[i]>num) {
				second=arr[i];
			}
		}
		
		System.out.println(second);

	}

}
