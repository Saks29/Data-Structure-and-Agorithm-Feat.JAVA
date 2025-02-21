public class MyClass {
    static void mazePath(int startingrow , int startingcol , int endrow , int endcol , String path){
        if(startingrow == endrow && startingcol == endcol){
            System.out.println(path);
            return;
            }
        if(startingrow > endrow || startingcol > endrow){
            return;
        }
        mazePath(startingrow + 1  , startingcol , endrow , endcol ,path + "V");
        mazePath( startingrow , startingcol + 1 , endrow , endcol ,path + "H");
    }  
    public static void main(String args[]) {
   mazePath(0,0,2,2,"");
  }
}
