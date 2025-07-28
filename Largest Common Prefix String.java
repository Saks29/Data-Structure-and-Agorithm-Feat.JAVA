/* Q.Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "". */
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String answer ="";
        int minlength = Integer.MAX_VALUE;
        for(int i = 0; i < strs.length ; i++){
            minlength = Math.min(minlength , strs[i].length());
        }
        for(int i = 0 ; i < minlength ;i++){
            char ch = strs[0].charAt(i);
            for(int j = 1 ; j<strs.length ;j++){
                if( strs[j].charAt(i) != ch) {
                    return answer;
                }
            }
            answer += ch;
        }
        return answer;
    }
}
