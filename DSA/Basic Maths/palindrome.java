import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        long revNum = 0;
        while(n != 0){
            int lastDigit = n%10;
            revNum = (revNum*10) + lastDigit; 
            n /= 10;
        }
        if(revNum == num)
            System.out.println("palindrome");
        else
            System.out.println("Not Palindrome");
        sc.close();
    }
}
