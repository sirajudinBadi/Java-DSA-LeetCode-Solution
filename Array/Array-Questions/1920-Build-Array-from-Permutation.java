//👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉https://x.com/Sirajudin79👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈
//👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉https://www.linkedin.com/in/sirajudinbadi79/👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈


class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length]; //Created the empty ans array to fill the values on the go

        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[nums[i]]; //ans[i] would be index of nums at nums[i] value.
        }

        return ans;
    }
}
