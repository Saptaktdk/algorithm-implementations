public class BinarySearch {
    public static int binarySearch(int nums[], int target) {
        int left = 0;
        int right = nums.length -1;

        while (left <= right) {
            int mid = left + (right -left)/2;

            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] < target) {
                left++;
            }
            else {
                right--;
            }
        } 
        return 0;
    }

    public static void main (String args[]) {

        int[] nums={2,7,4,3,9,12,34};
        int target = 9;

        int res = binarySearch(nums, target);
        System.out.println("Element found at index: " + res);

    }
}

//T.C = O(log n)
//S.C = O(1)