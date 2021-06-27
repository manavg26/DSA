package Arrays;

public class sorting012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c0,c1,c2,i;
		c0=c1=c2=0;
		int[] arr= {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		for(i=0;i<arr.length;i++) {
			if(arr[i]==1)
				c1++;
			else if(arr[i]==0)
				c0++;
			else if(arr[i]==2)
				c2++;
			
		}
		i=0;
		while(c0>0) {
			arr[i++]=0;
			c0--;
		}
		while(c1>0) {
			arr[i++]=1;
			c1--;
		}
		while(c2>0) {
			arr[i++]=2;
			c2--;
		}
		for(i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");

	}

}
