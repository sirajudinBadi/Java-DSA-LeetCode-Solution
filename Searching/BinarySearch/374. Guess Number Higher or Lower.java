//👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉https://x.com/Sirajudin79👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈
//👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉https://www.linkedin.com/in/sirajudinbadi79/👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈


/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return       -1 if num is higher than the picked number
 *                1 if num is lower than the picked number
 *                otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int start = 1;  // Search range starts from 1
        int end = n;

        while (start <= end) {
            int middle = start + (end - start) / 2; // Avoid overflow
            
            int result = guess(middle); // Call the guess API
            if (result == 0) {
                return middle;  // Found the number
            } else if (result == -1) {
                end = middle - 1;  // Search left half
            } else {
                start = middle + 1;  // Search right half
            }
        }
        return -1;  // Should not reach here if input is valid
    }
}
