//👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉https://x.com/Sirajudin79👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈
//👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉https://www.linkedin.com/in/sirajudinbadi79/👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈


class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        //We will use Binary Search Algorithm in this question
        int start = 0; //Start point for BS algo
        int end = letters.length - 1; //End point for BS algo

        while (start <= end){ //Condition to keep BSA running 
            int middle = start + (end - start) / 2; //To divide the array into two halves 

            //To check the array territory to go further
            if (target < letters[middle]){ 
                end = middle - 1;
            }else{
                start = middle + 1;
            }
        }
        return letters[start % letters.length]; //To get away with the wrap around condition.
    }
}
