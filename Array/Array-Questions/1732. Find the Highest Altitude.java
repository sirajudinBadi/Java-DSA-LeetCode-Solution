[Twitter]("https://x.com/Sirajudin79")
[LinkedIn]("https://www.linkedin.com/in/sirajudinbadi79/")

    
class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0, sum = 0;   //To track the max altitude ever reached and the running total of track altitude
        for(int point : gain){
            sum += point;   //Running sum
            if(sum >= max){ //If sum exceed max then assign max = sum
                max = sum;
            }
        }
        return max;
    }
}
