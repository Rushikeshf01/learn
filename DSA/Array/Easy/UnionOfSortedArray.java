import java.util.*;

public class UnionOfSortedArray {
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

        // HashSet<Integer> st = new HashSet<>();

        // for(int i=0;i<n;i++){
        // st.add(a[i]);
        // }
        // for(int j=0;j<m;j++){
        // st.add(b[j]);
        // }

        // for(int it:st){
        // ans.add(it);
        // }

        int i = 0, j = 0;

        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                if (ans.size() == 0 || a[i] != ans.get(ans.size() - 1)) {
                    ans.add(a[i]);
                }
                i++;
            } else {
                if (ans.size() == 0 || b[j] != ans.get(ans.size() - 1)) {
                    ans.add(b[j]);
                }
                j++;
            }
        }
        while (i < n) {
            if (a[i] != ans.get(ans.size() - 1)) {
                    ans.add(a[i]);
                }
                i++;
        }
        while (j < m) {
            if (b[j] != ans.get(ans.size() - 1)) {
                    ans.add(b[j]);
                }
                j++;
        }

        for (int k : ans) {
            System.out.print(k+" ");
        }
        sc.close();
    }
}
