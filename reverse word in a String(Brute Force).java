/* Q.Given an input string s, reverse the order of the words.
A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
Return a string of the words in reverse order concatenated by a single space.
Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.*/
class Solution {
    public String reverseWords(String s) {
        Stack<String> stack = new Stack<>();
        String Rev = "";
        for(int i = 0 ; i < s.length() ; i++){
            if( s.charAt(i) == ' '){
                if( stack.size() != -1 && Rev.length() != 0){
                    stack.push(Rev);
                    Rev = "";
                }
            }
            else{
                Rev += s.charAt(i);
            }
        }
        if( Rev.length() != 0) stack.push(Rev);
        String Result = "";
        while( stack.size() > 1){
            Result += stack.peek() + " ";
            stack.pop();
        }
        Result += stack.peek();
        return Result;
    }
}
