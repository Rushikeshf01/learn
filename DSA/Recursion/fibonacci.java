public class fibonacci {
    static int recursiveFibonacci(int n){
        if(n <= 1){
            return n;
        }
        return recursiveFibonacci(n-1)+recursiveFibonacci(n-2);
    }
    public static void main(String[] args) {
        int n = 5;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i] = recursiveFibonacci(i);
        }
        for (int i : ans) {
            System.out.print(i+" ");
        }
        
    }
}
