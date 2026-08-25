class Solution { 
    public int missingMultiple(int[] nums, int k) { 
        int i=0,j=1; 
        boolean found=false; 
        
        for(j=1; j<=101; j++){ 
            found=false;
            for(int n : nums){ 
                if(k*j == n) {
                    found = true; 
                    break; 
                }
            } 
            
            if(found == false){ 
                return k*j; 
            } 
        } 
        
        return k; 
    } 
}