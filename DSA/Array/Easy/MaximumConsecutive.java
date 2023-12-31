import java.util.Scanner;

public class MaximumConsecutive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int cnt = 0,ans=0;

        for(int i=0;i<n;i++){
            if(arr[i] == 1){
                cnt++;
            }
            else{
                cnt = 0;
            }
            ans = Math.max(ans,cnt);
        }
        System.out.println(ans);

        sc.close();
    }
}
