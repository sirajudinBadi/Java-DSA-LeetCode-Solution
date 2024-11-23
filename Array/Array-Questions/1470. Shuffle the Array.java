//👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉https://x.com/Sirajudin79👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈
//👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉https://www.linkedin.com/in/sirajudinbadi79/👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[n*2];

        for(int i = 0; i < n; i++){
            res[i*2] = nums[i];     //To add value from the first part at even places in res array.
            res[i*2+1] = nums[i+n]; //To add value from the second part at odd places in res array.
        }
    return res;
    }
}
