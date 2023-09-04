Leet Code Q :- 268
class Solution {
	public int missingNumber(int[] nums) {
       int n = nums.length;
        HashSet<Integer> set = new HashSet<>();

        for ( int i = 0; i <= n; i++ ) {
            set.add( i );
        }
        
        for ( int num : nums ) {
            set.remove( num);
        }
        return set.iterator().next();
    }
	
}