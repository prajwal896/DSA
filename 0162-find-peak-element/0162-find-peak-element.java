class Solution {
    public int findPeakElement(int[] nums) {
        int i,p=nums[0],in=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]>p){
                p=nums[i];
                in=i;
            }
        }
        return in;
    }
}