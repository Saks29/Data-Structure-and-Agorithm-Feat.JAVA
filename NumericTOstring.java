package DSApractice;

public class numTostring {
    static String[] arr = {"zero" , "ONE" , "TWO" , "THREE" , "FOUR" , "FIVE" , "SIX" , "SEVEN" , "EIGHT" , "NINE"};
    static void convert(int num){
        if(num == 0) 
        return;
        convert(num/10);
        int lastdigit = num % 10;
        System.err.print(arr[lastdigit] + " ");
    }
    public static void main(String[] args) {
        int num = 18319;
        convert(num);
    }
    
}
