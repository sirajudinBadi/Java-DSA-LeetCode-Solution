//👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉https://x.com/Sirajudin79👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈
//👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉https://www.linkedin.com/in/sirajudinbadi79/👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length; //To get the length of nums array
        int[] ans = new int[n*2]; //Empty array of double the size of nums length

        for(int i = 0; i < n; i++){
            ans[i] = nums[i]; //To append the value at i index
            ans[i+n] = nums[i];//To append the value at i+n index(repeated value)
        }

        return ans;
    }
}
