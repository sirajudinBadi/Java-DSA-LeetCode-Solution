//👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉https://x.com/Sirajudin79👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈
//👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉https://www.linkedin.com/in/sirajudinbadi79/👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈


class Solution {
    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        int sum = 0; //To keep track of the running sum
        for(int i = 0; i < nums.length; i++){
            runningSum[i] = nums[i] + sum;  //To add the current element and the sum of previous all elements
            sum += nums[i]; //To keep summing up the elements
        }
        return runningSum;
    }
}
