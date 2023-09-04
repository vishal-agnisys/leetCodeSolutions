// LC Q:- 1678

class Solution {
    public String interpret(String command) {             
        return command.replace("G","G").replace("()","o").replace("(al)","al");  
    }
	public String interpret(String command) {
        String result = "";
        String temp = "";
        for ( int i = 0; i < command.length(); i++ ) {
            char ch = command.charAt( i);
            temp += ch;
            switch ( temp ) {
                case "G":
                    result += "G";
                    temp = "";
                    break;
                case "()":
                    result += "o";
                    temp = "";
                    break;
                case "(al)":
                    result += "al";
                    temp = "";
                    break;
                default:
                    break;
            }
        }
        return result;
    }
    
}