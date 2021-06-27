package Arrays;

public class Kadanes_algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Largest sub-array sum
		int arr[]= {1,2,3,-2,5};
		System.out.print(sum(arr,arr.length));

	}

	 static int sum(int[] arr, int n) {
		// TODO Auto-generated method stub
		 int max_sum=arr[0],max_curr=0;
		 for(int i=0;i<n;i++) {
			 max_curr+=arr[i];
			 if(max_curr<0)
				 max_curr=0;
			 else if(max_curr>max_sum)
				 max_sum=max_curr;
		 }
		return max_sum;
	}

}
