class Solution { 
    public int[] twoSum(int[] nums, int target) { 
        int i=0, j=0, l=nums.length, p=0, sum=0;  
 
        for(i=0; i<=l-1; i++){  
            for(j=i+1; j<=l-1; j++){     
                sum = nums[i] + nums[j]; 
                 
                if(sum == target){ 
                    return new int[]{i, j}; 
                } 
            }  
        }  
            return new int[]{};
    }

}