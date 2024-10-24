// 👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉https://x.com/Sirajudin79👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈
// 👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉https://www.linkedin.com/in/sirajudinbadi79/👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈

class Solution {
    public int findNumbers(int[] nums) {

      // To keep track of count of numbers with even number of digits
       int count = 0;
        for(int element : nums){
            int digits = 0; //To count the digits
            while (element > 0){
                element /= 10;//To reduce the number towards 0 to terminate while loop
                digits++;
            }
            if (digits % 2 == 0){ //Check if the number of digits is even or not
                count++;
            }
        }
        return count;
    }
}
