/* Q.Given two strings s and t, determine if they are isomorphic.
Two strings s and t are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map
to the same character, but a character may map to itself.*/
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap <Character,Character> map = new HashMap<>();
        if(s.length() != t.length()) return false;
        for( int i=0 ; i<s.length() ; i++){
            if(map.containsKey(s.charAt(i))){
                if( map.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            }
            else{
                if(map.containsValue(t.charAt(i))){
                    return false;
                }
                map.put(s.charAt(i) , t.charAt(i));
            }
        }
        return true;
    }
}

 
