//👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉https://x.com/Sirajudin79👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈
//👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉https://www.linkedin.com/in/sirajudinbadi79/👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈


class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};   //Array to store the result and to return default value if no index found
        int start = search(nums, target, true); //called function to get first occurrence's index
        int end = search(nums, target, false);//Function to get last occurrence's index.

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    public int search(int[] nums, int target, boolean findFirstIndex){
        int ans = -1; //Default value of index 

        //Binary Search Algo
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int middle = start + (end - start) / 2;

            if(nums[middle] > target){
                end = middle - 1;
            }else if(nums[middle] < target){
                start = middle + 1;
            }else{ //For the potential Ans, checked if another target occurs before that result or not.
                ans = middle;
                if (findFirstIndex){
                    end = middle - 1;
                }else{
                    start = middle + 1;
                }
            }
        }
        return ans;
    }
}
