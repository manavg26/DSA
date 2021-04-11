package Arrays;

public class Kth_smallest_largest {
	 int kth_smallest(int[] arr, int l,int r, int k) {
		if(k>0 && k<=r-l+1) {
			int pos=rand_parti(arr,l,r,'s');
			if(pos-l==k-1)
				return arr[pos];
			if(pos-l > k-1)
				return kth_smallest(arr,l,pos-1,k);
			else
				return kth_smallest(arr,pos+1,r,k-1-pos+l);
		}
		else
			return 0;}
	 int kth_largest(int[] arr, int l,int r, int k) {
			if(k>0 && k<=r-l+1) {
				int pos=rand_parti(arr,l,r,'l');
				if(pos-l==k-1)
					return arr[pos];
				if(pos-l > k-1)
					return kth_largest(arr,l,pos-1,k);
				else
					return kth_largest(arr,pos+1,r,k-1-pos+l);				
			}
			else
				return 0;}
	

	  int rand_parti(int[] arr, int l, int r, char s) {
		// TODO Auto-generated method stub
		 int n=r-l+1;
		 int pivot=(int)(Math.random()*(n-1));
		 swap(arr,l+pivot,r);
		 if(s=='s')
		return parti(arr,l,r);
		 else
			 return parti_large(arr,l,r);
	}


	   int parti(int[] arr, int l, int r) {
		// TODO Auto-generated method stub
		  int x=arr[r],j,i=l;
		  for(j=l;j<r;j++) {
			  if(arr[j]<=x) {
				  swap(arr,i,j);
				  i++;
			  }
		  }
		  swap(arr,i,r);
		return i;
	}
	   int parti_large(int[] arr, int l, int r) {
			// TODO Auto-generated method stub
			  int x=arr[r],j,i=l;
			  for(j=l;j<r;j++) {
				  if(arr[j]>=x) {
					  swap(arr,i,j);
					  i++;
				  }
			  }
			  swap(arr,i,r);
			return i;
		}


	 void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		 int temp=arr[i];
		 arr[i]=arr[j];
		 arr[j]=temp;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kth_smallest_largest ob=new Kth_smallest_largest() ;
		int arr[]= {12,1,2, 3, 5, 7, 4, 19, 26};
		int n=arr.length-1;
		System.out.println(ob.kth_smallest(arr,0,n,6));
		System.out.println(ob.kth_largest(arr,0,n,2));
		

	}

}
