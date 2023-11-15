import java.util.Scanner;

public class charCountFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] charFreq = new int[26];

        for(int i = 0;i<s.length();i++){
            charFreq[s.charAt(i)-'a'] += 1;
        }
        for(int i:charFreq){
            System.out.print(i+" ");
        }
        sc.close();
    }
}
