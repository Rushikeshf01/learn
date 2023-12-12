import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int left = 0,right=n-1;
        Arrays.sort(arr);

        boolean flag = false;
        while(left < right){
            int sum = arr[left] + arr[right];

            if(sum == target){
                flag = true;
                System.out.println("YES");
            }

            if(sum>target) right--;
            else left++;
        }

        if(!flag) System.out.println("NO");

        sc.close();
    }
}
