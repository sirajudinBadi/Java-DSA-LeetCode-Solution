//👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉https://x.com/Sirajudin79👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈
//👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉https://www.linkedin.com/in/sirajudinbadi79/👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> result = new ArrayList<Boolean>(); //Created empty ArrayList to store boolean value of result
        int max = maxVal(candies); //To check what is the maximum value in candies array using function which is written below
      
        //Looped through candies array and added extraCandies to each child and checked if after getting extra candies, they will posses the maximum candies or not.
        for(int j = 0; j < candies.length; j++){ 
            int total = candies[j] + extraCandies; //Added extraCandies 
            if(total >= max){ //Checked if it is highest or not and added bool value to result array accordingly.
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }

  //Below is function to check what is the maximum value of candies array.
    static int maxVal(int[] candies) {
        int max = candies[0];

        for(int i = 1; i < candies.length; i++){
            if (candies[i] > max){
                max = candies[i];
            }
        }
        return max;
    }
}
