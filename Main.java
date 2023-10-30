import java.util.Arrays;
import java.util.Scanner;
import java.awt.*;
import java.text.*;
public class Main {

    public static void main(String[] args) {
        int[][] numbers = {{1,2,4,5}, {1,3,5,6}};
        System.out.println(Arrays.deepToString(numbers));

        final float PI = 3.14F;
        // pi = 1;

        double result = (double)10 / (double)3;
        System.out.println(result);

        int res = (3 * 10) / 2;
        System.out.println(res);
 
        String x = "1";
        int y = Integer.parseInt(x) + 2;
        System.out.println(y); 

        //Math class
        float myNum = 35.2F;
        int res1 = Math.round(myNum);
        int res2 = (int)Math.ceil(myNum);
        int res3 = (int)Math.floor(myNum);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);

        int ranNum = (int)(Math.random()*100);
        System.out.println(ranNum);

        String res4 = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(res4);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine().trim();
        System.out.println("You are "+ name);
    }
}