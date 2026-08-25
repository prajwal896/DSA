class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=1,j=0,l=numbers.length;
        for(i=0;i<numbers.length;i++){
            for(j=i+1;j<numbers.length;j++){
                int s= numbers[i]+numbers[j];
                if(s==target){
                    return new int[]{i+1,j+1};
                }
            }
        }
        return new int[]{};
    }
}