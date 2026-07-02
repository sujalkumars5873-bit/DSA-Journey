public class print_from_1toN_backtracking {

    public static void printno(int i, int n){
        if(i<1){
            return;
        }
        printno(i-1, n);
        System.out.println(i);
    }

    public static void main(String[] args) {
        int n =5;
        printno(n, n);
    }
}
