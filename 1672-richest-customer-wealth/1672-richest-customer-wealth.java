class Solution {
    public int maximumWealth(int[][] accounts) {
        int i=0,j=0,k=0,s1=0,s2=0;
       for ( i = 0; i < accounts.length; i++) {          // rows
         for ( j = 0; j < accounts[i].length; j++) {   // columns
            s1=s1+accounts[i][j];
          }
          if(s1>s2){
            s2=s1;
          }
          s1=0;
}
return s2;
    }
}