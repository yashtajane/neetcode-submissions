class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxa = 0,n=heights.length ;
        Stack <Integer> stack = new Stack();
        int [] ls = new int [n];
        int [] rs = new int [n];
        
        for(int i =0 ; i<n ; i++ ){
             ls[i] = -1 ;
            
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                stack.pop();
            }
            
             if (!stack.isEmpty()) {
                ls[i] = stack.peek();
            }
            stack.push(i);
        }

        stack.clear();

        for(int i=n-1 ; i>=0 ; i--){
             rs[i]=n;

             while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                stack.pop();
            }
             if (!stack.isEmpty()) {
                rs[i] = stack.peek();
            }

            stack.push(i);
        } 

        for (int i =0 ; i<n ; i++){
            ls[i]+=1;
            rs[i]-=1;

            maxa = Math.max(maxa , heights[i]*(rs[i]-ls[i]+1));
        }

        return maxa;
    }
}
