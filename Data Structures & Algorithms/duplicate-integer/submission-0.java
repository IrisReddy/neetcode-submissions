class Solution {
    public boolean hasDuplicate(int[] nums) {
        int l = nums.length;
        for(int i = 0; i < l; i++) {
            int count = 0;
            for(int j = 0; j < l; j++) {
                if(nums[i]==nums[j])
                count++;
            }
            if(count!=1)
            return true;
        }
        return false;
    }
}