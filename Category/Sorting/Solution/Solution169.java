Leet Code Q :- 169
class Solution {
	public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int majorityElement = nums.length/2;
        for ( int num: nums ) {
            if ( map.containsKey( num ) ){
                int count = map.get( num ) + 1;
                if ( count > majorityElement ){
                    return num;
                } else {
                    map.put( num, count );
                }
            } else {
                map.put( num, 1 );
            }
        }
        return nums[0];
    }
	
}