import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        final byte PERCENT = 100;
        final byte MONTHS_IN_YEAR = 12;

        int principal = 0;
        float monthlyInterest = 0;
        int noOfPayments = 0;  

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Principal ($1K - $1M): ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a number between 1,000 and 1,000,000.");
        }

        while (true) {
            System.out.print("Annual Interest Rate: ");
            float annaulInterest = scanner.nextFloat();
            if(annaulInterest>=1 && annaulInterest <= 30){
                monthlyInterest = annaulInterest / PERCENT / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }


        while (true) {

            System.out.print("Period (Years): ");
            byte years = scanner.nextByte();
            if(years >= 1 && years <= 30){
                noOfPayments = years * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value 1 and 30");
        }

        double res = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, noOfPayments)
                        / (Math.pow(1 + monthlyInterest, noOfPayments) - 1));

        String mortgage = NumberFormat.getCurrencyInstance().format(res);
        System.out.print("Mortgage: " + mortgage);

        scanner.close();

    }
}
