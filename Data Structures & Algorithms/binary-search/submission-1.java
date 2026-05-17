class Solution {
    public int search(int[] nums, int target) {

        int end = nums.length-1;
        int start = 0;

        while (start <= end){
            int check = (end +start)/2;
            if (nums[check] == target ){
                return check;
            }else if (nums[check] > target ){
                end = check-1;
            }else{
                start = check+1;
            }

        }


        return -1;
        
    }
}
