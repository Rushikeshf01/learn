import java.util.*;

public class IntersectionOfSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        List<Integer> ans = new ArrayList<>();
        int i = 0, j = 0;

        while (i < n && j < m) {
            if (a[i] < b[j]) {
                i++;
            } 
            else if(b[j]< a[i]){
                j++;
            }
            else {
                    ans.add(b[j]);
                    i++;
                    j++;
            }
        }

        for (int k : ans) {
            System.out.print(k+" ");
        }
        
        sc.close();
    }
}
