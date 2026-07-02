public class Print_nto1_backtracking {

    public static void printNto1(int i, int n){
        if(i>n){
            return;
        }
        printNto1(i+1, n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        int n = 5;
        printNto1(1, n);
    }
}
