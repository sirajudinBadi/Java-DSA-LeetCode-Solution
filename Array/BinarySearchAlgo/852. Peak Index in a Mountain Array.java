//👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉https://x.com/Sirajudin79👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈
//👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉https://www.linkedin.com/in/sirajudinbadi79/👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈


class Solution {
    public int peakIndexInMountainArray(int[] arr) {

        //created the start and end point of algorithm
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int middle = start + (end - start) / 2; //To get the middle element in the array

            //To check if the middle is greater than adjaacent elements and if so then return the middle which will be the peak
            if (arr[middle] > arr[middle + 1] && arr[middle] > arr[middle - 1]){ 
                return middle;
            }else if(arr[middle] < arr[middle + 1]){ //If middle was not the peak then shift the start ahead 
                start = middle + 1;
            }else{ //if middle was on the right side of max then shift backward the end.
                end = middle - 1;
            }
        }
        return end;
    }
}
