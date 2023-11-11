public class factorialOfN {
    static long calculateFactorial(int n){
        if(n==1){
            return 1;
        }
        return n*calculateFactorial(n-1);
    }
    static long calculateFactorial2(int i, long facto){
        if(i==1){
            return facto;
        }
        return calculateFactorial2(i-1,facto*i);
    }
    public static void main(String[] args) {
        int n = 4;
        // calculateSum(sum, n);
        System.out.println(calculateFactorial(n));
        System.out.println(calculateFactorial2(n,1));
    }
}
