Leet Code Q :- 1512
class Solution {
	
	public int numIdenticalPairs(int[] nums) {
        int ans = 0;
        int[] count = new int[104];
        for( int n : nums ){
            ans += count[n];
            count[n]++;
        }
        return ans;
    }

}