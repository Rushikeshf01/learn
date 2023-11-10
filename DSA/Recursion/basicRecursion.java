public class basicRecursion {
    static int cnt = 0;
    static void print(int i, int n){
        if(i > 5){
            return;
        }
        System.out.println(i);
        i++;
        print(i,n);
    }
    static void printNtimes(int n){
        if(n<0){
            return;
        }
        System.out.println("Coding Ninjas");
        n=n-1;
        printNtimes(n);
    }

    static int[] numArray;
    static int[] oneToN(int x){
        if(x==1){
            return numArray;
        }
        x=x-1;
        oneToN(x);
        numArray[x]=x;
        System.out.println(x);
        return numArray;
    }
    public static void main(String args[]){
        // print(1,5);
        // printNtimes(4);
        oneToN(5);
    }
}