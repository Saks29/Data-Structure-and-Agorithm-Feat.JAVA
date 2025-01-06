/*Q. Given an integer N, print the following pattern : 
Input Format: N = 6
Result:
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6*/

class Main {
   static void pattern3(int N)
{
    for (int i = 1; i <= N; i++)
    {

        for (int j = 1; j <= i; j++)
        {
            System.out.print(j+" ");
        }
        System.out.println();
    }
}

    public static void main(String[] args) {
        int N = 5;
        pattern3(N);
    }
}
