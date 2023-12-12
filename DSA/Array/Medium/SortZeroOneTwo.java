import java.util.Scanner;

public class SortZeroOneTwo {

    static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // int cnt0 = 0;
        // int cnt1 = 0;
        // int cnt2 = 0;

        // for (int i : arr) {
        // if(i==0) cnt0++;
        // else if(i==1) cnt1++;
        // else cnt2++;
        // }

        // for(int i=0;i<cnt0;i++){
        // arr[i]=0;
        // }
        // for(int j=cnt0;j<cnt0+cnt1;j++){
        // arr[j]=1;
        // }
        // for(int k=cnt0+cnt1;k<n;k++){
        // arr[k]=2;
        // }



        // DNF Sort

        int low = 0;
        int mid = 0;
        int high = n - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr,mid,low);
                low++;
                mid++;
            } else if (arr[mid] == 1)
                mid++;
            else {
                swap(arr,mid,high);
                high--;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}
