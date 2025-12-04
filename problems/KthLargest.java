//Given an integer array nums and an integer k, return the kth largest element in the array.

//Note that it is the kth largest element in the sorted order, not the kth distinct element.

import java.util.*;

public class KthLargest {
    public static int kthLargest(int[] nums, int k) {

	PriorityQueue<Integer> minHeap = new PriorityQueue<>();

	for (int num: nums) {
		minHeap.offer(num);

		if (minHeap.size() > k) {
			minHeap.poll();
		}
	}

	return minHeap.peek();
}
    public static void main (String args[]) {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;

        int res = kthLargest (nums, k);
        System.out.println(k + "th largest element is: " + res);
    }
}