Leet Code Q :- 1309
class Solution {
	public String freqAlphabets(String s) {
        String result = "";
        for ( int i = 0; i < s.length(); i++ ) {
            if ( i + 2 < s.length() && s.charAt( i+2) =='#' ) {
                String temp = s.charAt( i ) +""+ s.charAt( i + 1 );
                result += (char)(Integer.parseInt( temp) + 96);
                i = i + 2;
            } else {
                result += (char) ( Integer.parseInt( s.charAt( i ) +"") + 96) ;
            }
        }
        return result;
    }
	
}