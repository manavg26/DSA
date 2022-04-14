package array;

public class negpos_sort {
    public static void negpos_sort() {
        int[] arr = { -12, 11, 13, -5, 6, -7, 5, -3, -6 };
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0)
                n++;
        }
        int high=n;
        int neg=0,pos=0;
        int t;
       while(neg<arr.length){
           if(arr[pos]<0){
               pos++;
               neg++;
           }
           else{
               if(arr[neg]<0){
                   t=arr[pos];
                   arr[pos]=arr[neg];
                   arr[neg]=t;
                   pos++;
                   neg++;
               }
               else{
                   neg++;
               }
           }
       }
       for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);

    }

    // Java program to move all negative numbers to the
    // beginning and all positive numbers to the end with
    // constant extra space


        // a utility function to swap two elements of an array
        public static void swap(int[] ar, int i, int j) {
            int t = ar[i];
            ar[i] = ar[j];
            ar[j] = t;
        }

        // function to shilf all negative integers to the left
        // and all positive integers to the right
        // using Dutch National Flag Algorithm
        public static void move(int[] ar) {
            int low = 0;
            int high = ar.length - 1;
            while (low <= high) {
                if (ar[low] <= 0)
                    low++;
                else
                    swap(ar, low, high--);
            }
        }

        // Driver code
        public static void main(String[] args) {
            int[] ar = { -12, 11, 13, -5, 6, -7, 5, -3, -6 };
            move(ar);
            for (int e : ar)
                System.out.print(e + " ");
        }
    }

    // This code is contributed by Vedant Harshit


