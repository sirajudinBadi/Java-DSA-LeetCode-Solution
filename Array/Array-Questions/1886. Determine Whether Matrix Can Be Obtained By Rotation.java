//👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉https://x.com/Sirajudin79👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈
//👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉👉https://www.linkedin.com/in/sirajudinbadi79/👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈👈


class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        int rot90 = 0;
        int rot180 = 0;
        int rot270 = 0;
        int rot0 = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
            if(target[i][j] == mat[n-j-1][i]){
                rot90++;
            }

            if(target[i][j] == mat[n-i-1][n-j-1]){
                rot180++;
            }

            if(target[i][j] == mat[j][n-i-1]){
                rot270++;
            }

            if(target[i][j] == mat[i][j]){
                rot0++;
            }
        }
        }

        if(rot90 == n*n || rot180 == n*n || rot270 == n*n || rot0 == n*n){
            return true;
        }else{
            return false;
        }
    }
}
