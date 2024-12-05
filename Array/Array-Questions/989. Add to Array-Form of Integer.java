//👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉https://x.com/Sirajudin79👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈
//👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉https://www.linkedin.com/in/sirajudinbadi79/👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = num.length;

        // Start from the last digit of the array
        int carry = 0;
        int i = n - 1;

        while (i >= 0 || k > 0 || carry > 0) {
            int digit = (i >= 0 ? num[i] : 0); // Take the digit from the array if available
            int sum = digit + (k % 10) + carry; // Add current digit, k's digit, and carry
            ans.add(0, sum % 10); // Extract the last digit and prepend to the list
            carry = sum / 10; // Update the carry
            k /= 10; // Move to the next digit of k
            i--; // Move to the next digit of num
        }

        return ans;
    }
}
