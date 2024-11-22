//👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉https://x.com/Sirajudin79👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈
//👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉https://www.linkedin.com/in/sirajudinbadi79/👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈


class Solution {
    public int splitArray(int[] nums, int k) {
        int start = 0; //To get the minimum ans possible which will be the max element in array
        int end = 0; //To get the maximum ans possible which will be the sum of an entire array

        for(int i = 0; i < nums.length; i++){
            start = Math.max(start, nums[i]); //To get max element
            end += nums[i]; //To get sum of array
        }

        //Based on min and max possible ans, we ran BS algo on it
        while(start < end){ 
            int middle = start + (end - start) / 2; //To get the middle as the smallest among the largest sum of subarray

            int sum = 0; //To track the sum of subarray
            int pieces = 1; //To track the number of subarrays.

            for(int num : nums){
                if(sum + num > middle){ //If sum of subarrray exceeds middle element then make the new subarray and increase pieces
                    sum = num;
                    pieces ++;
                }else{ //If not exceed middle then keep adding element in subarray and increase sum
                    sum += num;
                }
            }

            //If number of subarrays exceeds the k then shift the start post middle otherwise make middle as the end element.
            if(pieces > k){
                start = middle + 1;
            }else{
                end = middle;
            }
        }

        return end; //at the end start, middle and end would be same so we can return anything we like.
    }
}
