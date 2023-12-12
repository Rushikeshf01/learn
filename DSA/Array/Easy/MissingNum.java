import java.util.Scanner;

public class MissingNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n-1; i++) {
            arr[i] = sc.nextInt();
        }

        // Natural Sum method

        int sum = (n*(n+1))/2;
        int arrSum = 0;

        for(int i=0;i<n-1;i++){
            arrSum += arr[i];
        }

        System.out.println(sum-arrSum);

        //Xor Sum method

        int xor1 = 0, xor2 = 0;

        // for(int i=1;i<=n;i++){
        //     xor1 = xor1^i;
        // }

        for(int i=0;i<n-1;i++){
            xor1 = xor1 ^ (i+1);
            xor2 = xor2^arr[i];
        }
        xor1 = xor1^n;
        System.out.println(xor1^xor2);
        sc.close();
    }
}
