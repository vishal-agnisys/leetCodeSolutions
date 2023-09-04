Leet Code Q :- 1859
class Solution {
	
	public String sortSentence(String s) {
        String[] splitS = s.split( " ");
        String[] arr = new String[splitS.length];
        for ( String temp: splitS ) {
            int position  = Integer.parseInt( String.valueOf( temp.charAt( temp.length() - 1 )));
            arr[position - 1] = temp.replace( String.valueOf( position), "");
        }
        String result = "";
        for ( int i = 0; i < arr.length; i++ ) {
            if ( i == 0 ){
                result += arr[i];
            } else {
                result += " " + arr[i];
            }
        }
        return result;
    }
}