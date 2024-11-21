//👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉https://x.com/Sirajudin79👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈
//👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉https://www.linkedin.com/in/sirajudinbadi79/👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈


class Solution {
    // Find the target element in a rotated sorted array
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        // If there is no pivot, perform binary search on the whole array
        if (pivot == -1) {
            return simpleBinarySearch(nums, target, 0, nums.length - 1);
        }

        // If the pivot itself is the target
        if (nums[pivot] == target) {
            return pivot;
        }

        // Determine which part of the array to search
        if (target >= nums[0]) {
            return simpleBinarySearch(nums, target, 0, pivot - 1);
        }

        return simpleBinarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    // Find the pivot index in a rotated sorted array
    public int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;

            // Check if middle is a pivot
            if (middle < end && nums[middle] > nums[middle + 1]) {
                return middle;
            }

            if (middle > start && nums[middle] < nums[middle - 1]) {
                return middle - 1;
            }

            // Adjust the search space
            if (nums[start] > nums[middle]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }

        return -1; // No pivot found
    }

    // Perform binary search
    public int simpleBinarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (target < nums[middle]) {
                end = middle - 1;
            } else if (target > nums[middle]) {
                start = middle + 1;
            } else {
                return middle; // Target found
            }
        }

        return -1; // Target not found
    }
}
