public class Print_1_to_n_using_recursion {

    public static void print1toN(int i, int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        print1toN(i+1, n);
    }
    public static void main(String[] args) {
        int n = 5;
        print1toN(1, n);
    }
}
