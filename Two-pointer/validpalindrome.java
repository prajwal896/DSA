class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        boolean flag=true;
        StringBuilder se = new StringBuilder();
        for(i=0;i<s.length();i++){
        if((s.charAt(i)>='a' && s.charAt(i)<='z') ||
          (s.charAt(i)>='A' && s.charAt(i)<='Z')||
          (s.charAt(i)>='0' && s.charAt(i)<='9')){
        se.append(s.charAt(i));
         }
         }
         i=0;
String sb = se.toString().toLowerCase();
        int j=sb.length()-1;
        while (i<j){
            if(sb.charAt(i)!=sb.charAt(j)){
                return false;
            }
            if(sb.charAt(i)==sb.charAt(j)){
                i++;
                j--;
            } 
        }
        return true;
    }
}
//
