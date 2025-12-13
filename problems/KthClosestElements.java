//Given a sorted integer array arr, two integers k and x, return the k closest integers to x in the array. The result should also be sorted in ascending order.
//An integer a is closer to x than an integer b if:
//|a - x| < |b - x|, or
//|a - x| == |b - x| and a < b
//Constraints:
//1 <= k <= arr.length
//1 <= arr.length <= 10^4
//arr is sorted in ascending order.
//-10^4 <= arr[i], x <= 10^4
//Example :
//Input: arr = [1,2,3,4,5], k = 4, x = 3
//Output: [1,2,3,4]

public class KthClosestElements {
    public static int[] kthClosest(int[] nums, int k, int x) {
	//Create the sliding window
	int left = 0;
	int right = nums.length - k;

	while (left < right) {
		int mid = left + (right - left)/2;
		if (Math.abs(nums[mid] - x) > Math.abs(nums[mid+k] - x)) {
			left = mid + 1; // right window better
		}
		else {
			right = mid; // else left window better
		}
		
	}

	// return the window starting from left to right
	int[] res = new int[k];
	
	for (int i=0; i<k; i++) {
		res[i] = nums[left];
		left++;
	}
	
	return res;
	
    }

    public static void main (String args[]) {
        int[] nums = {1,2,3,4,5};
        int k = 4;
        int x = 3;

        int[] res = kthClosest(nums, k, x);
        System.out.print("K closest elements are: ");
        for (int num: res) {
        	System.out.print(num + " ");
        }
    }

}