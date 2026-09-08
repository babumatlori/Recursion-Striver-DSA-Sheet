package Basic_Problems_Recursion_02;

public class PrintMess {
    static void printMess(int n) {
        if( n==0 ) return;
        System.out.println("Babu");
        printMess( n-1 ); //each call prints the mess once then calls itself with n-1;
    }

    public static void main(String[] args) {
        printMess(5);
    }
}
