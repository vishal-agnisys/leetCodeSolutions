LeetCode Q :- 414

class Solution {
	public int thirdMax( int[] nums ){
        Arrays.sort( nums );
        if ( nums.length < 3 ){
            return nums[nums.length - 1];
        }
        int n = nums.length - 1;
        int count = 0;
        while ( count < 3 ) {
            if ( n == nums.length - 1 ){
                count++;
                n--;
            } else {
                if ( nums[n] != nums[n + 1] ){
                    count++;
                    n--;
                } else if ( nums[n] == nums[n + 1] ){
                    n--;
                }
            }
            if ( count == 3 ){
                return nums[n + 1];
            } else if ( n < 0 ){
                return nums[nums.length - 1];
            }
        }
        return 0;

    }
}