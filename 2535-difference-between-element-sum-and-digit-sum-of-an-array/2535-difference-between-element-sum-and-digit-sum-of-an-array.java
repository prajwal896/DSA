class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0 , asum=0,n=0,s=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            int l=nums[i];
            if(l>9){
                n=nums[i];
                while(n!=0){
                    s=n%10;
                    asum=s+asum;
                    n = n / 10;
                }
            }
            else{
                asum= asum+ nums[i];
            }
        }
        return  Math.abs(sum - asum);
    }
}