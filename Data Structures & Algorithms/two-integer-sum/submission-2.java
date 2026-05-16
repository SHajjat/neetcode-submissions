class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer , Integer > seen = new HashMap<>();

        for (int i = 0; i< nums.length;i++){
            int myNumber = target-nums[i];
            if (seen.containsKey(myNumber)){
                return new int []{seen.get(myNumber), i};
            }else {
                seen.put(nums[i],i);
            }
        }

        return null;
        
    }
}
