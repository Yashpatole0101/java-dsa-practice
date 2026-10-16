package Arrays;

public class Array03_lowest {

	public static void main(String[] args) {
		int num=Integer.MAX_VALUE;
		
		int[] arr= {8,98,56,78,1,66};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<num) {
				num=arr[i];
			
			}
		}
		
		System.out.println("lowest number is: "+num);
	}

}
