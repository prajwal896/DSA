import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> se = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            if(se.contains(nums[i])) {
                return true;
            }

            se.add(nums[i]);
        }

        return false;
    }
}