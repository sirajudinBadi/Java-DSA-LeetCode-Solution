//👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉https://x.com/Sirajudin79👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈
//👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉https://www.linkedin.com/in/sirajudinbadi79/👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈

class Solution {
    public int[][] transpose(int[][] matrix) {
        int m = matrix[0].length;
        int n = matrix.length;

        int[][] transposeMat = new int[m][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                transposeMat[j][i] = matrix[i][j];
            }
        }
        return transposeMat;
    }
}
