public class sumFirstN {
    static long calculateSum(int n){
        if(n==0){
            return 0;
        }
        return n+calculateSum(n-1);
    }

    //Parameterised way
    static long calculateSum2(int i, long sum){
        if(i<1){
            return sum;
        }
        return calculateSum2(i-1,sum+i);
    }
    public static void main(String[] args) {
        int n = 5;
        // calculateSum(sum, n);
        System.out.println(calculateSum(n));

        // calculateSum2(n, sum);
        System.out.println(calculateSum2(n, 0));

        //using formula
        int ans = n * (n+1)/2;
        System.out.println(ans);
    }
}
