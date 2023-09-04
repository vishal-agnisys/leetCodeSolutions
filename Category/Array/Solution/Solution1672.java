Leet Code Q :- 1672
class Solution {
	public int maximumWealth(int[][] accounts) {
        int max = 0;
        for ( int[] account: accounts ) {
            int temp = 0;
            for ( int j = 0; j < account.length; j++ ) {
                temp += account[j];
            }
            if ( temp > max )
                max = temp;
        }
        return max;
    }
	
}