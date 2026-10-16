package Arrays;

public class Array01 {

	public static void main(String[] args) {
		
		int sum =0;
		int[] arr=new int[5];
		
		arr[0]=1;
		arr[1]=10;
		arr[2]=6;
		arr[3]=5;
		arr[4]=3;
		
		
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			System.out.println(arr[i]);
		}
		System.out.println("*******************************");
		System.out.println(sum);

	}

}
