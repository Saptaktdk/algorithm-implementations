public class MergeSort {
    public static void mergeSort(int nums[], int left, int right) {
        int mid = left + (right - left)/2;

        if (left >= right) {
            return;
        }

        mergeSort(nums, left, mid); // left half
        mergeSort(nums, mid+1, right); // right half
        merge(nums, left, mid, right);
    }

    public static void merge (int[] nums, int left,int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        //create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        //copy data to temp arrays
        for (int i=0; i<n1; i++) {
            L[i] = nums[left + i];
        }
        for (int j=0; j<n2; j++) {
            R[j] = nums[mid + 1 + j];
        }

        //merge the temp arrays
        int i=0, j=0, k=left;

        while(i<n1 && j<n2) {
            if (L[i] <= R[j]) {
                nums[k] = L[i];
                i++;
            }
            else {
                nums[k] = R[j];
                j++;
            }
            k++;
        }

        // copy remaining elements of L[] if any
        while (i<n1) {
            nums[k] = L[i];
            i++;
            k++;
        }

        // copy remaining elements of R[] if any
        while (j<n2) {
            nums[k] = R[j];
            j++;
            k++;
        }


    }

    public static void main  (String args[]) {
        
        int nums[] = {38,27,43,3,9,82,10};
        mergeSort(nums, 0, nums.length-1);

        System.out.println("Sorted array: ");
        for (int n: nums) {
            System.out.println(n);
        }
    }
}