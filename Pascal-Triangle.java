// Q.Given an integer numRows, return the first numRows of Pascal's triangle.
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int row = 1 ; row <= numRows ; row++){
            List<Integer> temp = new ArrayList<>();
            int answer = 1 ;
            temp.add(answer);
            for( int col = 1 ; col < row ; col++){
                answer = answer * (row - col);
                answer = answer/col;
                temp.add(answer);
            }
            result.add(temp);
        }
        return result;
    }
}
