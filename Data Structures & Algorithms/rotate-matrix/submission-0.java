class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] rm = new int[n][n];
        for(int r = 0 ; r<n ; r++){
            for(int c=0 ; c<n;c++){
               rm[c][n-1-r]=matrix[r][c];
            }
        }
         for(int r = 0 ; r<n ; r++){
            for(int c=0 ; c<n;c++){
               matrix[r][c]=rm[r][c];
            }
        }

        // return matrix;
    }
    
}
