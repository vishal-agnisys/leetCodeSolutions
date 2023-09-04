Leet Code Q :- 1704
class Solution {
	
	public boolean halvesAreAlike(String s) {
        int count1 = 0;
        int count2 = 0;
        Set<Character> chatSet = new HashSet<>();
        chatSet.add( 'a');
        chatSet.add( 'e');
        chatSet.add( 'i');
        chatSet.add( 'o');
        chatSet.add( 'u');
        chatSet.add( 'A');
        chatSet.add( 'E');
        chatSet.add( 'I');
        chatSet.add( 'O');
        chatSet.add( 'U');
        for ( int i = 0; i < s.length()/2; i++ ) {
            char ch = s.charAt( i );
            if ( chatSet.contains( ch) ){
                count1++;
            }
        }
        for ( int i = s.length()/2; i < s.length(); i++ ) {
            char ch = s.charAt( i );
            if ( chatSet.contains( ch) ){
                count2++;
            }
        }
        return count1 == count2;
    }
}