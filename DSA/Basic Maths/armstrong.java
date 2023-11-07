import java.util.Scanner;

public class armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int originalNum = n;

        int count = 0;
        int temp = n;

        while(temp != 0){
            count++;
            temp /= 10;
        }

        int sum = 0;
        while(n != 0){
            int lastDigit = n%10;
            sum += Math.pow(lastDigit, count); 
            n /= 10;
        }
        if(sum == originalNum)
            System.out.println("Armstrong number");
        else
            System.out.println("Not Armstrong number");
        sc.close();
    }
}
