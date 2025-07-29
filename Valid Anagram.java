/* Q.Given two strings s and t, return true if t is an anagram of s, and false otherwise. */
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap < Character , Integer > count1 = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++){
            if(count1.containsKey(s.charAt(i))){
                count1.put(s.charAt(i),count1.get(s.charAt(i)) + 1);
            }
            else{
                count1.put(s.charAt(i),1);
            }
        }
        HashMap < Character , Integer > count2 = new HashMap<>();
        for(int i = 0 ; i < t.length() ; i++){
            if(count2.containsKey(t.charAt(i))){
                count2.put(t.charAt(i),count2.get(t.charAt(i)) + 1);
            }
            else{
                count2.put(t.charAt(i),1);
            }
        }
        if(count1.equals(count2)){
            return true;
        }
        return false;

    }
}
