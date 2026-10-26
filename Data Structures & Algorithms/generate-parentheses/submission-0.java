class Solution {
      public void backtrack (int open , int close , int n , StringBuilder stack , List<String> res){
        if(open == n && close == open ){
            res.add(stack.toString());
        }
        if(n > open){
            stack.append('(');
            backtrack(open+1,close,n,stack,res);
            stack.deleteCharAt(stack.length()-1);
        }
        if(open > close){
            stack.append(')');
            backtrack(open,close+1,n,stack,res);
            stack.deleteCharAt(stack.length()-1);
        }
      }

     public List<String> generateParenthesis(int n) {
        StringBuilder stack = new StringBuilder();
        List<String> res = new ArrayList<>();
        backtrack(0,0,n,stack,res);
        return res ; 
    }
}
