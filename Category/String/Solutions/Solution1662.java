Leet Code Q :- 1662
class Solution {
	public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = "";
        String str2 = "";
        
        int n = word1.length > word2.length ? word1.length : word2.length;
        for ( int i = 0; i < n; i++ ){
            if ( i < word1.length ){
                str1 += word1[i];
            }
            if ( i < word2.length ){
                str2 += word2[i];
            }
        }
        return str1.equals( str2);
        
    }
	
}