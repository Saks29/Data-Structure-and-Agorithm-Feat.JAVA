/* Q.Given an input string s, reverse the order of the words.
A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
Return a string of the words in reverse order concatenated by a single space.
Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.*/
class Solution {
    public String reverseWords(String s) {
        String rev = "";
        String answer = "";
        for(int i = s.length() - 1 ; i >= 0 ; i--){
            if(s.charAt(i) == ' ' && rev.length() != 0){
                if( answer.length() == 0){
                    answer = rev ;
                    rev = "";
                }
                else{
                    answer += " " + rev;
                    rev = "";
                }
            }
            else if(s.charAt(i) != ' '){
                rev = s.charAt(i) + rev;
            }
        }
        if(rev.length() != 0){
            if(answer.length() != 0) answer += " " + rev;
            else answer = rev;
        }
        return answer;
    }
}
