//👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉https://x.com/Sirajudin79👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈
//👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉https://www.linkedin.com/in/sirajudinbadi79/👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈


class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length]; //To store the count if condition matched

        for(int i = 0; i < nums.length; i++){ //Outer loop to compare one to other
            int count = 0; //To keep track of condition
            for(int j = 0; j< nums.length; j++){ //Inner loop to traverse the comparison
                if(j == i){ //To negate the same element comparison
                    continue;
                }
                if(nums[j] < nums[i]){ //To apply the condition.
                    count++;
                }
            }
            ans[i] = count; //To append the count of condition match to final array.
        }
        return ans;
    }
}
