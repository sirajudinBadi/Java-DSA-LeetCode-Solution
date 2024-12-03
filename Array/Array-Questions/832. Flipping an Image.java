//👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉https://x.com/Sirajudin79👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈
//👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉https://www.linkedin.com/in/sirajudinbadi79/👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈


class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] row : image){     //To iterate over the rows
            for(int i = 0; i <(row.length + 1)/2; i++ ){    //To iterate over the colums while reversing and also changing elements
                int temp = row[i];
                row[i] = row[row.length - 1 - i] == 0 ? 1 : 0;  //Reverse the row and also change the elements based on the condition
                row[row.length - 1 - i] = temp == 1 ? 0 : 1;
            }
        }
        return image;
    }
}
