import java.util.Scanner;

public class CheckSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n-1;i++){
            if(arr[i]<=arr[i+1]){
                continue;
            }
            else{
                System.out.println(0);;
            }
        }
        System.out.println(1);
        sc.close();
    }
}

//check if sorted and rotated both

// public class CheckSorted {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
        
//         int[] arr = new int[n];

//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }

//         int cnt = 0;
//         for(int i=1;i<n;i++){
//             if(arr[i-1]>arr[i]){
//                 cnt++;
//             }
//         }

//         if(arr[n-1] > arr[0]) cnt++;

//         if(cnt<=1){
//             System.out.println(true);
//         }
//         else{
//             System.out.println(false);
//         }
//     }
// }