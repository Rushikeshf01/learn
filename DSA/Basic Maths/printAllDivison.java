import java.util.*;

public class printAllDivison {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> list = new ArrayList<Integer>(); 
        for(int i=1;i <= Math.sqrt(n) ;i++){
            if(n%i == 0){
                list.add(i);

                if(i/(n/i) != 1){
                    list.add(n/i);
                }
            }
        }
        Collections.sort(list);
        System.out.println(list);

        sc.close();
    }
}
