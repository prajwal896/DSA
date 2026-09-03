class Solution {
    public void sortColors(int[] nums) {
        int i = 0;
        int c0 = 0, c1 = 0, c2 = 0;

        for (int n : nums) {
            if (n == 0) {
                c0++;
            }
            else if (n == 1) {
                c1++;
            }
            else {
                c2++;
            }
        
        }
        i=0;

        while (i < nums.length) {
            if (i < c0) {
                nums[i] = 0;
                i++;
            }
            else if(i >= c0 && i<c1+c0) {
                nums[i] = 1;
                i++;
            }
            else{   nums[i] = 2;
                i++;
            }
        }
    }
}