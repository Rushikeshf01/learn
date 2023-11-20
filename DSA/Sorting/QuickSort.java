import java.util.Scanner;
public class QuickSort {

    static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

    static int partition(int[] arr, int low, int high){
		int i = low, j = high;
		int pivot = arr[low];

		while(i<j){
			while(i<high && arr[i]<=pivot ){
				i++;
			}
			while(j>low && arr[j]>pivot){
				j--;
			}
			if(i<j){
                swap(arr,i, j);
			}
		}
        swap(arr, low, j);

		return j;
	}
    static void quickSort(int[] arr, int l, int h){
        if(l<h){
            int partitionIdx = partition(arr, l, h); 
            quickSort(arr, l, partitionIdx-1);
            quickSort(arr, partitionIdx+1, h);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        quickSort(arr, 0, n-1);

        for (int i : arr) {
            System.out.println(i+" ");
        }

        sc.close();
    }

}
