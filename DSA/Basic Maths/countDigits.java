
/*

=> Problem statement

https://www.codingninjas.com/studio/problems/count-digits_8416387?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

*/
import java.util.Scanner;

public class countDigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int n = value;
        int count = 0;
        while(n!=0){
            int lastDigit = n%10;
            if(value%lastDigit == 0){
                count++;
            }
            n/=10;
        }
        System.out.println(count);
        sc.close();
    }
}
