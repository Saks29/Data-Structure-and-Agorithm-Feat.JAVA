/* Q.A valid parentheses string is either empty "", "(" + A + ")", or A + B, where A and B are valid parentheses strings, and + represents string concatenation.

For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.
A valid parentheses string s is primitive if it is nonempty, and there does not exist a way to split it into s = A + B, with A and B nonempty valid parentheses strings.

Given a valid parentheses string s, consider its primitive decomposition: s = P1 + P2 + ... + Pk, where Pi are primitive valid parentheses strings.

Return s after removing the outermost parentheses of every primitive string in the primitive decomposition of s.*/
class Solution {
    public String removeOuterParentheses(String s) {
        int count = 0;
        StringBuilder answer = new StringBuilder();

        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);

            if(ch == '(' ){
                count += 1;
                if( count > 1){
                    answer.append(ch);
                }
            }
            else if( ch == ')' ){
                count -= 1;
                if( count > 0){
                    answer.append(ch);
                }
            }
        }

        return answer.toString();
    }
}
