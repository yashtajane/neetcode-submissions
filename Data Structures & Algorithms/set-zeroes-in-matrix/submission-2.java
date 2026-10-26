class Solution {
  

    public void setZeroes(int[][] matrix) {
     int nr= matrix.length;
     int nc=matrix[0].length;
    //  int cc =0;
     int[][]cc =new int[nr][nc];
    

     for (int r = 0; r < nr; r++) {
            System.arraycopy(matrix[r], 0, cc[r], 0, nc);
        }
    
        for(int r=0 ; r<nr ; r++){
            for(int c=0 ; c<nc ; c++){
                if(matrix[r][c]==0){
                    for (int col = 0; col < nc; col++) {
                        cc[r][col] = 0;
                    }
                    for (int row = 0; row < nr; row++) {
                        cc[row][c] = 0;
                    }   
                }
                // if(cc==1) break;
            }
        //   if(cc=1)break;  
        }

        for (int r = 0; r < nr; r++) {
            System.arraycopy(cc[r], 0,matrix[r] , 0, nc);
        }
    }
}
