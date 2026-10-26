class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) return "0";
        if(num2.length()>num1.length()){
            return multiply(num2,num1);
        }
        String res="";
        int zero=0;
        for(int i=num2.length()-1 ; i>=0 ; i--){
            String curr = mul(num1,num2.charAt(i),zero);
            res = add(res,curr);
            zero++;
        }

        return res;
    }
    String mul(String s , char d , int z){
        int i = s.length()-1;
        int ss= d-'0';
         StringBuilder cur = new StringBuilder();
        int carry=0;
        while(i>=0|| carry > 0){
            int n =(i>=0) ? s.charAt(i)-'0' : 0;
            int prod = n*ss + carry;
            carry = prod/10;
            cur.append(prod%10);
            i--;
        }

        return cur.reverse().toString()+"0".repeat(z);
    }
    String add(String s1,String s2){
        int i=s1.length()-1;
        int j=s2.length()-1;
        StringBuilder res = new StringBuilder();
        int carry=0;
        while(i>=0 || j>=0|| carry>0){
             int n1 = (i >= 0) ? s1.charAt(i) - '0' : 0;
            int n2 = (j >= 0) ? s2.charAt(j) - '0' : 0;
            int sum = n1+n2+carry;
            carry=sum/10;
            res.append(sum%10);
            i--; j--;
        }

        return res.reverse().toString();
    }

}
