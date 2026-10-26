class Solution {

    public String encode(List<String> strs) {
       StringBuilder result = new StringBuilder();

       for(String s : strs){
       result.append(s.length()).append('#').append(s);
    }
   String r = result.toString();

    return r ; 
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList();
       int i=0; int j=i;
       while(i<str.length()){
        while(str.charAt(j)!='#'){
            j++;
        }
        int length = Integer.parseInt(str.substring(i,j));
        i=j+1;
        j=i+length;
        result.add(str.substring(i,j));
        i=j;
       }
         return result;
    }
}
