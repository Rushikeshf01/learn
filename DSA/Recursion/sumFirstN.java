public class sumFirstN {
    static long calculateSum(int n){
        if(n==1){
            return n;
        }
        return n+calculateSum(n-1);
    }
    public static void main(String[] args) {
        int n = 2;
        // calculateSum(sum, n);
        System.out.println(calculateSum(n));

        //using formula
        int ans = n * (n+1)/2;
        System.out.println(ans);
    }
}
