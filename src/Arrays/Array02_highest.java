package Arrays;

public class Array02_highest {

	public static void main(String[] args) {
		int[] arr= {7,3,0,10,98,54,33};
		
		int num=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>num) {
				num=arr[i];
				
			}
		}
		
		System.out.println("highest numder is:"+num);

	}

}
