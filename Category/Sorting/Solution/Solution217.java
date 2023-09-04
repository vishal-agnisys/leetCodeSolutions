Leet Code Q :- 217
class Solution {
	public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> uniqueSet = new HashSet<>();
        for ( int i = 0; i < nums.length; i++ ) {
            if ( uniqueSet.contains(nums[i]) ){
                return true;
            } else {
                uniqueSet.add( nums[i] );
            }
        }        
        return false;
    }
	
}