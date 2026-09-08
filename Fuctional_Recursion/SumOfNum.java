package Fuctional_Recursion;


// dry RUN


public class SumOfNum {
    static int sum(int n) {
        if( n == 0) {
            return 0;
        }
// sum(0) = 0
// sum(1) = 1 + 0 = 1
// sum(2) = 2 + 1 = 3
// sum(3) = 3 + 3 = 6
// sum(4) = 4 + 6 = 10
// sum(5) = 5 + 10 = 15
        return n + sum( n - 1);  //using the functional recursion
    }

    public static void main(String[] args) {

    }
}
