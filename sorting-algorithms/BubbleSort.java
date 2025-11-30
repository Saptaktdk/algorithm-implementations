public class BubbleSort {
    public static void bubbleSort(int nums[]) {
        for (int i=0; i<nums.length-1; i++) {
            for (int j=0; j<nums.length-i-1;j++) {
                if (nums[j]>nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1]=temp;
                }
            }
    }   }

    public static void main(String args[]) {
       int nums[] = { 23,67, 89,12,4,60,39};
       bubbleSort(nums);

       for (int n:nums) {
            System.out.println(n);
       }
    }
}

// T.C = O(n^2)
// S.C = O(1)