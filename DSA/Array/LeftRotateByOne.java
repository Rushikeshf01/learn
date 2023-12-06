import java.util.Scanner;

public class LeftRotateByOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int tmp = arr[0];
        
        int i = 1;
        while(i<n){
            arr[i-1] = arr[i];
            i++;
        }
        arr[n-1] = tmp;

        for (int k : arr) {
            System.out.println(k+" ");
        }
        sc.close();
    }
}
