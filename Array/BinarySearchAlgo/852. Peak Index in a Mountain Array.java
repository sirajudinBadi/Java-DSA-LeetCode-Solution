//👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉https://x.com/Sirajudin79👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈
//👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉https://www.linkedin.com/in/sirajudinbadi79/👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈


class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int middle = start + (end - start) / 2;

            if(arr[middle] > arr[middle + 1]){  //We are inside the increasing part of the array
                end = middle; //To shrink the end of an array backwards
            }else{  //We are inside the decreasing part of the array
                start = middle + 1; //To shrink the start of the array towards the end(forward)
            } 
        }
        return start; //We can return end as well bcz at the end start and end both are same.
    }
}
