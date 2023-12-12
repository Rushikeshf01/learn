import java.util.Scanner;

public class SecondLargest {
    static private int secondLargest(int n, int []a){
        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(a[i] > large){
                secondLarge = large;
                large=a[i];
            }
        }
        return secondLarge;
    }
     static private int secondSmallest(int n, int []a){
       
        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(a[i]<small){
                secondSmall = small;
                small = a[i];
            }
            else if(a[i] < secondSmall && a[i] != small){
                secondSmall = a[i];
            }
        }
        return secondSmall;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int[] ans = new int[2];

        ans[0] = secondLargest(n,arr);
        ans[1] = secondSmallest(n,arr);
        for (int i : ans) {
            System.out.print(i+" ");
        }

        sc.close();
    }
}
