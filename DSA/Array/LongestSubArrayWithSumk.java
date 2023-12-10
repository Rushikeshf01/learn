import java.util.*;

// this is the most optimal approch for array containing zero and positve elements only

public class LongestSubArrayWithSumk{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int mx =  Integer.MIN_VALUE;
        long sum = arr[0];
        
        int left = 0;
        int right = 0;
        
        while(right < n){
            
            while(left <= right && sum>k){
                sum -= arr[left];
                left++;
            }
            
            if(sum == k) {
                mx = Math.max(mx, right-left+1);
            }
            right++;
            if(right < n) {
                sum += arr[right];
            }
        }
        
        System.out.println(mx);
        sc.close();
    }
}



// for array having pos,neg and zero check out optimal approch is using HashMaps

// public class LongestSubArrayWithSumk{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int k = sc.nextInt();
        
//         int[] arr = new int[n];
        
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
        
//         int mx = Integer.MIN_VALUE;
//         Map<Long, Integer> preSumMap = new HashMap<>();

//         long sum = 0;

//         for(int i=0;i<n;i++){
//             sum +=arr[i];

//             if(sum == k){
//                 mx = Math.max(mx, i+1);
//             } 

//             long rem = sum - k;

//             if(preSumMap.containsKey(rem)){
//                 int len = i - preSumMap.get(rem);
//                 mx = Math.max(mx, len);
//             }

//             if(!preSumMap.containsKey(sum)){
//                 preSumMap.put(sum, i);
//             }
//         }
        
//         System.out.println(mx);
//         sc.close();
//     }
// }