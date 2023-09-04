Leet Code Q :- 1929
class Solution {
	public int[] getConcatenation(int[] nums) {
        int size = nums.length;
        int[] result = new int[2*size];
        for ( int i = 0; i < size; i++ ){
            result[i] = nums[i];
            result[i + size] = nums[i];
        }
        return result;
    }
	
}