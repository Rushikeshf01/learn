import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashmapCollection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        
        HashMap<Integer, Integer> mp = new HashMap<>();
        
        for(int i = 0;i < n; i++){
            int key = arr[i];
            int freq = 0;
            if(mp.containsKey(key)) freq = mp.get(key);
            freq++;
            mp.put(key, freq); 
        }
        
        for(Map.Entry<Integer, Integer> it: mp.entrySet()){
            System.out.println(it.getKey() + "->" + it.getValue());
        }
        
        
        
        String s = sc.next();

        HashMap<Character, Integer> mpChar = new HashMap<>();

        for(int i = 0;i < s.length(); i++){
            char key = s.charAt(i);
            int freq = 0;
            if(mpChar.containsKey(key)) freq = mpChar.get(key);
            freq++;
            mpChar.put(key, freq); 
        }

        for(Map.Entry<Character, Integer> it: mpChar.entrySet()){
            System.out.println(it.getKey() + "->" + it.getValue());
        }


        sc.close();
    }
}
