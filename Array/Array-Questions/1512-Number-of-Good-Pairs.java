//👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉https://x.com/Sirajudin79👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈
//👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉https://www.linkedin.com/in/sirajudinbadi79/👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0; //To track the number of good pair count

        for(int i = 0; i<nums.length; i++){ //To compare each element with rest element
            for(int j = i+1; j<nums.length; j++){ //To keep iterating over all the elements while keeping ith element stable
                if(nums[i] == nums[j] && i < j){ //Applied the given condition to check good pair
                    count++;
                }
            }
        }
        return count;
    }
}
