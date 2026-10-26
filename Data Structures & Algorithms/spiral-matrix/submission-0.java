class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top=0,right=matrix[0].length,left=0,bottom=matrix.length;
        List<Integer>res=new ArrayList<>();
        while(top<bottom && left<right){
            //left to right
            for(int i = left ; i<right ; i++)
            res.add(matrix[top][i]);
            
           top++;

            //right to bottom
            for(int j=top ; j<bottom ; j++)
            res.add(matrix[j][right-1]);

             right--;
             if (!(left < right && top < bottom)) {
                break;
            }
            //bottom to left
            for(int k=right-1 ; k>=left ; k--)
            res.add(matrix[bottom-1][k]);
             bottom--;
            //left to up
            for(int l=bottom-1 ; l>=top ; l--)
            res.add(matrix[l][left]);

            left++;

        }

        return res;
    }
}
