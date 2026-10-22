package Arrays;

public class Array08_evenoddsum {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		
		int evensum=0;
		int oddsum=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				evensum=arr[i]+evensum;
			}
			
			else {
				oddsum+=arr[i];
			}
		}
		
		System.out.println(evensum);
		System.out.println(oddsum);

	}

}
