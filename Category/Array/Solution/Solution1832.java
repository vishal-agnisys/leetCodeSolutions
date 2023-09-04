Leet Code Q :- 1832
class Solution {
	
	public boolean checkIfPangram(String sentence) {
        if ( sentence.length() < 26 ){
            return false;
        }
        boolean [] mark = new boolean[26];   
        Arrays.fill( mark, false );
        for( int i = 0; i < sentence.length(); i++ ) {
            int value = (int) sentence.charAt( i );            
            mark[value-97] = true;
        }
        for ( boolean b: mark ) {
            if ( !b ){
                return false;
            }
        }
        return true;
    }

}