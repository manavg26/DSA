package Arrays;

public class neg_pos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {-12, 11, -13, -5, 6, -7, 5, -3, -6};
		int n=arr.length;
		sort(arr,n);
		printarr(arr);

	}
	private static void sort(int[] arr, int n) {
		// TODO Auto-generated method stub
		int j=0,temp;
		for(int i=0;i<n;i++) {
			if(arr[i]<0) {
				if(i!=j)
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				j++;
			}
		}
		
	}
	static void printarr(int[] arr) {
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

}
