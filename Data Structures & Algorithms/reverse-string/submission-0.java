class Solution {
    public void reverseString(char[] s) {
        char[] w = new char[s.length];
        int i=0;
        int j=s.length-1;

        while(i<s.length && j>=0){
            w[i]=s[j];
            j-- ; i++ ; 
        }

        for(int k = 0 ; k<s.length ; k++){
            s[k]=w[k];
        }
    }
}