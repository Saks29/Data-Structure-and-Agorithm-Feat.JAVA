// Q.Given an integer N , Print all binary strings of size N which do not contain consecutive 1s.A binary string is that string which contains only 0 and 1.
// User function Template for Java

class Solution {
    
    public static List<String> generateBinaryStrings(int n) {
        // code here
        List<String> result = new ArrayList<>();
        
        conversion("" , result , n);
        return result;
    }
    public static void conversion( String prefix , List<String> result , int n){
        if( prefix.length() == n){
            result.add(prefix);
            return ;
        }
        
        conversion( prefix + "0" , result , n);
        
        if(prefix.isEmpty() || prefix.charAt(prefix.length() - 1) != '1'){
            conversion( prefix + "1" , result , n);
        }
    }
}
