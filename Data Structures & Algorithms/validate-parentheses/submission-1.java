class Solution {
    public boolean isValid(String s) {
       Stack<Character> st = new Stack();
       Map<Character,Character> cto = new HashMap<>();

       cto.put(')','(');
       cto.put(']','[');
       cto.put('}','{');

       for(char ch : s.toCharArray()){

        if(cto.containsKey(ch)){
            if(!st.isEmpty() && st.peek()==cto.get(ch)){
                st.pop();
            }
            else{
                return false;
            }
        }
         else{
        st.push(ch);
       }

       }
      return st.isEmpty();
    }
}
