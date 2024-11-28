//👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉https://x.com/Sirajudin79👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈
//👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉https://www.linkedin.com/in/sirajudinbadi79/👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈

Follow Me on [Twitter](https://x.com/Sirajudin79)
Follow Me on [LinkedIn](https://www.linkedin.com/in/sirajudinbadi79/)


class Solution {
    public boolean checkIfPangram(String sentence) {

        //If length of string is less than 26 then it can not contain all the letters.
        if(sentence.length() < 26){
            return false;
        }

        //To iterate over alphabet and check if it's index in string is less than 0 i.e. not in string then it is not pangram
        for(char ch = 'a'; ch <= 'z'; ch++){
            if(sentence.indexOf(ch) < 0){
                return false;
            }
        }
        return true;
    }
}
