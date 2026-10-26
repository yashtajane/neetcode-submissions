class Solution {
    public boolean isPalindrome(String s) {
        int f=0,l=s.length()-1;

        while (f<l){
            while(!laykiAheKa(s.charAt(f)) && f<l){
               f++;
            }
            while(!laykiAheKa(s.charAt(l)) && f<l){
               l--;
            }
            if(Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(f))){
                return false;
            }
             f++; l--;
        }
         return true;    
        }

       public boolean laykiAheKa(char ch){
        return(
            ch>='A' && ch<='Z' ||
            ch>='a' && ch<='z' ||
            ch>='0' && ch<='9'
        );
    }
    
    }

    

