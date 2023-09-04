Leet Code Q :- 1773
class Solution {
	public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int resultCount = 0;
        int needToCheckIndex;
        if ( ruleKey.equals( "type" ) ) {
            needToCheckIndex = 0;
        } else if ( ruleKey.equals( "color" ) ) {
            needToCheckIndex = 1;
        } else {
            needToCheckIndex = 2;
        }
        for ( List<String> item: items ) {
            if ( item.size() > needToCheckIndex && item.get( needToCheckIndex ).equals( ruleValue ) ) {
                resultCount++;
            }
        }        
        return resultCount;                
    }
	
	//Java 8 
	public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int resultCount = 0;
        int needToCheckIndex;
        if ( ruleKey.equals( "type" ) ) {
            needToCheckIndex = 0;
        } else if ( ruleKey.equals( "color" ) ) {
            needToCheckIndex = 1;
        } else {
            needToCheckIndex = 2;
        }
        return items.stream()
                .filter( (item) -> ( item.size() > needToCheckIndex && item.get( needToCheckIndex ).equals( ruleValue ) ) )
                .map( (_item) -> 1 )
                .reduce( resultCount, Integer::sum );
        
                
    }
	
}