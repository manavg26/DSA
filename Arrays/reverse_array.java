package Array;


public class reverse_array {

	public static int[] reverse(int[] arr) {
		for(int i=0;i<arr.length/2;i++) {
			int t=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-1-i]=t;
		}
		
		return arr;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		int[] rev_arr=reverse(arr);
		int i=0;
		while(i<arr.length) {
			System.out.println(rev_arr[i]);
			i++;
		}

	}

}
