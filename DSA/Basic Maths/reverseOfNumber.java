import java.util.Scanner;

public class reverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double revNum = 0;
        while(n != 0){
            int lastDigit = n%10;
            revNum = (revNum*10) + lastDigit; 
            n /= 10;
        }

        if(revNum > Integer.MAX_VALUE){
            System.out.println(0);
        }
        System.out.println(revNum);
        sc.close();
    }
}
