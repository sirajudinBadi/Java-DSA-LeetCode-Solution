//👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉https://x.com/Sirajudin79👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈
//👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉https://www.linkedin.com/in/sirajudinbadi79/👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈

// Extends VersionControl class to access isBadVersion API
public class Solution extends VersionControl {

    // Function to find the first bad version
    public int firstBadVersion(int n) {
        
        // Initialize the search range from 1 to n
        int start = 1;
        int end = n;

        // Perform binary search until start equals end
        while(start < end){

            // Calculate the middle point to avoid overflow
            int mid = start + (end - start) / 2;

            // If mid is a bad version, search the left half
            if(isBadVersion(mid)){
                end = mid; 
            } else { 
                // If mid is not a bad version, search the right half
                start = mid + 1; 
            }
        }
        
        // When start equals end, the first bad version is found
        return start;
    }
}
