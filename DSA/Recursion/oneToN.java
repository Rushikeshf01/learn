public class oneToN {
    
    //using Backtracking
    static void printOneToN(int x, int[] ans){
        if(x==0){
            return;
        }
        printOneToN(x-1, ans);
        ans[x-1] = x;
    }
    
    public static void main(String[] args) {
        int x = 5;
        int[] numArray = new int[x];
        printOneToN(x, numArray);

        for (int i : numArray) {
            System.out.println(i);
        }
    }
}
