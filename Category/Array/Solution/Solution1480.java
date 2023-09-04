Leet Code Q :- 1480
class Solution {
	
	public int[] runningSum(int[] nums) {
        int[] arr = new int[nums.length];
        int prevSum = 0;
        for( int i = 0; i < nums.length; i++ ) {
            prevSum += nums[i];
            arr[i] = prevSum;
        }
        return arr;
    }
}