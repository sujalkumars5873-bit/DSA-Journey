public class Print_n_to_1_using_recursion {
    public static void printNto1(int i, int n){
        if(i<1){     // In 1st cycle i will be 5 which is greater then 1. therefore fun will move further and print i means 5 at first cycle.
            return;
        }
        System.out.println(i);
        printNto1(i-1, n);           // after printing 5 i will be reduced by 1 and new i will be 4. and cycle goes on till i will less then 1.
    }

    public static void main(String[] args) {
        int n = 5;
        printNto1(n, n); //here n is written instead of i b'coz we have to take the value of i = 5 at the starting to print 5 to 1. 
    }
}
