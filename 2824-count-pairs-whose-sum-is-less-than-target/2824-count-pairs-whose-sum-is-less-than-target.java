class Solution { 
    public int countPairs(List<Integer> nums, int target) { 
        int i=0, j=0, l=nums.size(), p=0, sum=0; 
        
        for(i=0; i<=l-1; i++){ 
            for(j=i; j<=l-1; j++){ 
                
                sum = nums.get(i) + nums.get(j);
                
                if(sum < target && 0 <= i && i < j && j < l){
                    p++;
                }
            } 
        }
        
        return p; 
    } 
}