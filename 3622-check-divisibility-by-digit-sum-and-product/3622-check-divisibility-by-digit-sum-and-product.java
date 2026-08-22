class Solution {
    public boolean checkDivisibility(int n) {
       int sum=0, product=1, d=n;
       //boolean f=true;
       int first;
       while(n!=0){
        first=n%10;
        product=first*product;
        sum=first+sum;
        n=n/10;
       }
        
        int t=(product+sum);
        
        if(d%t==0){
            return true;
        }
        else{
            return false;
        }
        
    }
}