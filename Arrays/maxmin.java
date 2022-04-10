package Array;
public class maxmin {

	public static class pair{
		int max;
		int min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,6,44,32,18};
//		int min=arr[0];
//		int max=0;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>max)
//				max=arr[i];
//			if(arr[i]<min)
//				min=arr[i];
//		}
		
		pair minmax=findminmax(arr,0,arr.length-1);
		System.out.println(minmax.max);
		System.out.print(minmax.min);
		
	}

	private static pair findminmax(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		pair minmax=new pair();
		pair mml=new pair();
		pair mmr=new pair();
		if(start==end) {
			minmax.max=arr[start];
			minmax.min=arr[start];
			return minmax;
		}
		if(start+1==end) {
			if(arr[start]>arr[end]) {
				minmax.max=arr[start];
				minmax.min=arr[end];
			}
			else {
				minmax.max=arr[end];
				minmax.min=arr[start];
			}
			return minmax;			
		}
		int mid=(start+end)/2;
		mml=findminmax(arr,start,mid);
		mmr=findminmax(arr,mid+1,end);
		
		if(mmr.max<mml.max) {
			minmax.max=mml.max;
		}
		else {
			minmax.max=mmr.max;
		}
		if(mmr.min<mml.min) {
			minmax.min=mmr.min;
		}
		else {
			minmax.min=mml.min;
		}
		
		
		return minmax;
			
		
	}

}
