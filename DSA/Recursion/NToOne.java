public class NToOne {
    static void printNToOne(int x, int[] ans){
        if(x==0){
            return;
        }
        ans[x-1] = (ans.length - x)+1;
        printNToOne(x-1, ans);
    }

    //using Backtracking
    static void printNToOne2(int i,int x){
        if(i>x){
            return;
        }
        printNToOne2(i+1,x);
        System.out.println(i);
    }
    public static void main(String[] args) {
        int x = 5;
        int[] numArray = new int[x];

        printNToOne(x, numArray);

        for (int i : numArray) {
            System.out.println(i);
        }

        printNToOne2(1,x);
    }
}
