package array;

import java.util.Arrays;
import java.util.HashSet;

public class union_sorted {
    public static void main(String[] args) {
        int[] a={ 7, 1, 5, 2, 3, 6 };
        int[] b={ 3, 8, 6, 20, 7};
        Arrays.sort(a);
        Arrays.sort(b);

        HashSet <Integer>s=new HashSet<>();
        
        int l1=a.length;
        int l2=b.length;
        for (int e : a) {
            s.add(e);
        }
        for (int i : b) {
            s.add(i);
        }
        System.out.println("Size of set is: "+s.size());
        int[] arr= new int[l1+l2];
        int j=0,index=0;

        // while(i<l1 && j<l2){
        //     if(a[i]<b[j]){
        //         arr[index++]=a[i];
        //         i++;
        //     }
        //     else if(a[i]>b[j]){
        //         arr[index++]=b[j];
        //         j++;
        //     }
        //     else{
        //         arr[index++]=a[i];
        //         i++;
        //         j++;
        //     }
        // }
        // if(i<l1){
        //     while(i<l1){
        //         arr[index++]=a[i];
        //         i++;
        //     }
        // }
        // if(j<l2){
        //     while(j<l2){
        //         arr[index++]=b[j];
        //         j++;
        //     }
        // }
        
        if (l1 < l2) {
            arr[index++] = a[0];
            for (int i = 1; i < l1; i++) {
                if (a[i] != a[i - 1])
                    arr[index++] = a[i];
            }
            for (int i = 0; i < l2; i++) {
                if (search(arr, 0, index, b[i]) < 0)
                    arr[index++] = b[i];
            }
        } 
        else {
            arr[index++] = b[0];
            for (int i = 1; i < l2; i++) {
                if (b[i] != b[i - 1])
                    arr[index++] = b[i];
            }
            for (int i = 0; i < l1; i++) {
                if (search(arr, 0, index, a[i])==-1)
                    arr[index++] = a[i];
            }
            

        }

        for (int e = 0; e < index; e++) {
            System.out.println(arr[e]);
        }
        System.out.println("length of array is: " + index);

    }


    public static int search(int[] arr, int l, int r, int x) {
        if (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return search(arr, l, mid - 1, x);
            else
                return search(arr, mid+1, r, x);

        }
        return -1;
    }
}
