import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),m = sc.nextInt();

        // if(m == 0){
        //     System.out.println(n); 
        // }
        // if(n==0){
        //     System.out.println(m);
        // }
        // int ans = 1;
        // for(int i = Math.min(n, m);i >= 1; i--){
        //     if(n%i == 0 && m%i == 0){
        //         ans = i;
        //         break;
        //     }
        // }
        // System.out.println(ans);

        // using eucledian algorithm

        while(n > 0 && m > 0){
            if(n > m){
                n= n%m;
            }
            else{
                m = m%n; 
            }

        }
        if(m == 0){
            System.out.println(n); 
        }
        if(n==0){
            System.out.println(m);
        }
        sc.close();
    }
}
