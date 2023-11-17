import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HighestLowestFreq{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[n];

        for(int i=0;i<n;i++){
            v[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> mp = new HashMap<>();

        for(int i=0;i<v.length;i++){
            int key = v[i];
            int val = 0;
            if(mp.containsKey(key)) {

            val = mp.get(key);
            }
            val++;
            mp.put(key, val);
        }

        int ans[] = new int[2];

        int maxFreq = 0, maxEle = 0;
        int minFreq = v.length, minEle = 1000000000;
        
        for(Map.Entry<Integer, Integer> it: mp.entrySet()){
            if(it.getValue()>maxFreq){
                maxFreq = it.getValue();
                maxEle = it.getKey();
            }
            if(it.getValue()==maxFreq && it.getKey()<maxEle){
                    maxEle=it.getKey();
            }
            if(it.getValue()<minFreq){
                minFreq = it.getValue();
                minEle = it.getKey();
            }
            if(it.getValue() == minFreq && it.getKey()<minEle){
                    minEle = it.getKey();
            }
        }

        ans[0] = maxEle;
        ans[1] = minEle;
        System.out.println(maxEle);
        System.out.println(minEle);
        
        sc.close();
    }
}
         
                 

                

                  

        