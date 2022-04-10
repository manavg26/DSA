package Array;

public class sort_012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int low=0,mid=0,t=0;
		int[] arr= {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		int high=arr.length-1;
		while(mid<=high) {
			switch(arr[mid]) {
			case 0:{
				t=arr[mid];
				arr[mid]=arr[low];
				arr[low]=t;
				low++;
				mid++;
				break;}
			case 1:
				mid++;
				break;
			case 2:
				{
					t=arr[high];
				arr[high]=arr[mid];
				arr[mid]=t;
				high--;
				break;}
			}
		}
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);

		
		

	}

}
