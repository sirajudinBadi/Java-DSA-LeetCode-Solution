//👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉https://x.com/Sirajudin79👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈
//👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉https://www.linkedin.com/in/sirajudinbadi79/👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈


class Solution {
    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length]; //emtpy array to store the running sum value
        for(int i = 0; i < nums.length; i++){
            if(i==0){   //To store the value of first iteration because 0-1 iteration does not exist.
                runningSum[i] = nums[i];
                continue; //To get out of iteration after storing the first value of running sum.
            }
            runningSum[i] = nums[i] + runningSum[i-1]; //For rest iteration, storing the running sum value
        }
        return runningSum;
    }
}
