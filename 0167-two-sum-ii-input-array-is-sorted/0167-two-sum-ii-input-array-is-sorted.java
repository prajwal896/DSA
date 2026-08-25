class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0,j=numbers.length-1,l=numbers.length, s=0;
        do{
         s=numbers[i]+numbers[j];
         
         if(s==target){
            return new int[]{i+1,j+1};
         }
         if(s>target){
            j--;
         }
         if(s<target){
            i++;
         }
        }
        while(i<j);
        return new int[]{};
    }
}