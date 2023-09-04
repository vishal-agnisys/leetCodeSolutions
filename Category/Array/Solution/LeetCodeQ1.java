//Leet Code Question 1 :- https://leetcode.com/problems/two-sum/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        HashMap<Integer, Integer> value = new HashMap<>();
        for ( int i = 0; i < nums.length; i++ ) {            
            int remaningValue = target - nums[i];
            if ( value.containsKey(remaningValue) ) {
                arr[0] = value.get( remaningValue );
                arr[1] = i;
                return arr;
            }
            value.put( nums[i], i );
        }
        return arr;
    }
}
