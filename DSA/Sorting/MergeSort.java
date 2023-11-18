import java.util.Scanner;

public class MergeSort {

    static void merge(int[] arr, int l,int mid, int h){
        
        int n1 = mid-l+1;
        int n2 = h - mid;

        int[] temp1 = new int[n1];
        int[] temp2 = new int[n2];

        System.out.println("mid is "+ mid);
        System.out.println("temp1 length :"+ (mid-l+1)+" and l is "+l);
        System.out.println("temp2 length :"+ (h-mid)+ " and h is " + h);
        
        for(int i=0;i<n1;i++){
            temp1[i] = arr[l+i];
        }
        for(int j=0;j<n2;j++){
            temp2[j] = arr[mid+1+j];
        }
        int i = 0, j = 0;

        int k = l;
        while(i<n1 && j<n2){
            if(temp1[i]<temp2[j]){
                arr[k] = temp1[i];
                i++;
                k++;
            }
            else{
                arr[k] = temp2[j];
                j++;
                k++;
            }
        }

        while(i<n1){
            arr[k] = temp1[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = temp2[j];
            j++;
            k++;
        }
        for (int g : arr) {
            System.out.print(g+" ");
        }
        System.out.println();
    }

    static void mergeSort(int[] arr, int l, int h){
        if(l<h){
            int mid = (l+h)/2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, h);
            merge(arr,l,mid,h);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        mergeSort(arr, 0, n-1);

        for (int i : arr) {
            System.out.println(i+" ");
        }

        sc.close();
    }
}
