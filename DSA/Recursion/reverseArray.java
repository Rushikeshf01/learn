public class reverseArray {
    static void reverse(int i, int[] nums,int n){
        if(i>=n/2){
            return;
        }
        // swap(nums[l], nums[r]);
        int temp = nums[i];
        nums[i] = nums[n-i-1];
        nums[n-i-1] = temp;
        reverse(i+1, nums, n);
    }
    public static void main(String[] args) {
        int n = 5;
        int[] nums = {1,4,2,6,7};
        int i = 0;

        reverse(i,nums,n);
        for(int j: nums){
            System.out.print(j+" ");
        }
    }
}
