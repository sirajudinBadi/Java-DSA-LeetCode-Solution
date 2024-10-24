//👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉https://x.com/Sirajudin79👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈
//👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉https://www.linkedin.com/in/sirajudinbadi79/👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈

class Solution {
    public int maximumWealth(int[][] accounts) {

        // To track through the person with maximum wealth
        int max = 0;


      // To iterate through all customers
        for(int person = 0; person < accounts.length; person++){
            int sum = 0; //To keep track of total wealth of each cutomer.
            for (int balance = 0; balance < accounts[person].length; balance++) {
                sum += accounts[person][balance];//To add each account balance to total
            }

            // Compared each person's total and updated the max's value if person is richest.
            if (sum >= max){
                max = sum;
            }
        }
        return max;
    }
}

    
        
