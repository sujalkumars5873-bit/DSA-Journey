public class Sum_of_n_no {

    public static int sum1toN(int n){
        if(n == 0){
            return 0;
        }
        return n+ sum1toN(n-1);
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(sum1toN(n));
    }
}
