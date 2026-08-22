class Solution { 
    public void merge(int[] nums1, int m, int[] nums2, int n) { 
        int i=0,j=0,s=0; 
        int[] t = new int[m+n]; 
        while(s<=t.length-1 && i<=m-1 && j<=n-1) { 
            if(nums1[i]<nums2[j]) { 
                if(i<=m-1) { 
                    t[s]=nums1[i]; 
                    i++; 
                } 
                else{
                    break;
                }
                s++; 
            }
            else {  
                if(j<=n-1) { 
                    t[s]=nums2[j];
                    j++; 
                } 
                else{
                    break;
                }
                s++; 
            } 
        } 
        if(i>m-1) { 
                while(j<=n-1) { 
                    t[s]=nums2[j]; 
                    if(j<=n-1) { 
                        j++; 
                    } 
                    s++; 
                } 
            } 
            
            if(j>n-1) { 
                while(i<=m-1) {
                t[s]=nums1[i]; 
                if(i<=m-1) { 
                    i++; 
                } 
                s++; 
                }
            } 
        
        for(i=0;i<=t.length-1;i++) { 
            nums1[i]=t[i]; 
        } 
    } 
}
