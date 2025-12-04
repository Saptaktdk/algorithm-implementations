//You are given a list of integers nums. You can reduce the length of nums by taking any two integers, removing them, and appending their sum to the end. The cost of doing this is the sum of the two integers you removed.

//Return the minimum total cost of reducing nums to one integer.

import java.util.*;

public class OneInteger {
    public static int oneInteger(int[] nums) {
	PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    int count=0;
    int sum=0;

	for (int num: nums) {
		minHeap.offer(num);
	}

	while (minHeap.size() != 1) {
		
		sum = minHeap.poll() + minHeap.poll();

		minHeap.offer(sum);
        count += sum;
	}

	return count;				
		

	}

    public static void main (String args[]) {
        int[] nums = {1,2,3,4,5};

        int res = oneInteger(nums);
        System.out.println("Final integer is: " + res);
    }
	

}

