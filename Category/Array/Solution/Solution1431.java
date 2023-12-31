Leet Code Q :- 1431
class Solution {
	
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for ( int i : candies ){
            if ( i > max )
                max = i;
        }
        List<Boolean> result = new ArrayList<>();
        for( int i = 0; i < candies.length; i++ ){
            if ( candies[i] + extraCandies >= max ){
                result.add( Boolean.TRUE);
            } else {
                result.add( Boolean.FALSE );
            }
        }
        
        return result;
    }
}