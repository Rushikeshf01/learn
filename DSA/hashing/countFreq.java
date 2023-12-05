import java.util.Scanner;

public class countFreq {
    public static int[] countFrequency(int n, int x, int []nums){
        // Write your code here.
        int[] frqArray = new int[n];

        for(int i=0; i<nums.length;i++){
            if(nums[i]-1 < n){
                frqArray[nums[i]-1] +=1;
            }
        }
        
        return frqArray;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] numArray = new int[n];
        for(int i=0;i<n;i++){
            numArray[i] = sc.nextInt();
        }

        int q = sc.nextInt();

        int[] freqArray = new int[100000000];
        for(int i=0;i<n;i++){
            freqArray[numArray[i]] += 1;
        }

        while(q>0){
            int number = sc.nextInt();
            System.out.println(freqArray[number]);
            q-=1;
        }
        // for(int i=0;i<n;i++){
        //     System.out.println(numArray[i]);
        // }
        sc.close();

    }   
}
