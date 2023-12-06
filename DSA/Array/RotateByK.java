import java.util.Scanner;

public class RotateByK {
    private static void reverse(int[] arr, int s, int e){
        while(s<e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
    private static void rotateToLeft(int[] arr, int n, int k) {
        if (n == 0)
            return;
        if (k > n)
            return;
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            arr[i] = arr[i + k];
        }
        for (int i = n - k; i < n; i++) {
            arr[i] = temp[i - n + k];
        }
    }

    private static void rotateByReverse(int[] arr, int n,int k){

        if(k>n) k=k%n;

         //Rotate to left by k
        // reverse(arr, 0, k-1);
        // reverse(arr, k, n-1);
        // reverse(arr, 0, n-1);

        //Rotate to Right by k
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        k=k%n;
        rotateToLeft(arr, n, k);

        // Reversal Method
        rotateByReverse(arr, n, k);

        for (int i : arr) {
            System.out.print(i+" ");   
        }
        sc.close();

    }
}
