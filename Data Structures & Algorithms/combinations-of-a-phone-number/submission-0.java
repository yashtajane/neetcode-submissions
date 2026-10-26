class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return new ArrayList<>();
        String [] alphaNum = {"" , "" , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tuv", "wxyz"};
        List<String> res = new ArrayList<>();
        res.add("");

        for(char digit : digits.toCharArray()){
            List<String> temp = new ArrayList<>();
            for(String curStr : res){
                for(char c : alphaNum[digit-'0'].toCharArray() ){
                       temp.add(curStr + c);
                }
            }
            res = temp ;
        }
        return res ;
    }
}
