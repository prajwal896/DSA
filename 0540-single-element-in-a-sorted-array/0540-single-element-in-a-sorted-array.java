class Solution {
    public int singleNonDuplicate(int[] nums) {
        int i=0, l=nums.length-1;
        if(nums.length == 1){
    return nums[0];
}
if(nums[0]!=nums[1]){
    return nums[0];
}
if(nums[l]!=nums[l-1]){
    return nums[l];
}
        for(i=1;i<nums.length-1;i++){
           
            if(nums[i]!=nums[i+1] && nums[i]!=nums[i-1]){
                return nums[i];
            }
        }
        return nums[i];
    }
}