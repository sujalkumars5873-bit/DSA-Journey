public class print_all_the_divisors {
    public static void main(String[] args) {
        int n = 36;
        
        for(int i = 1; i<=n; i++){
            if(n % i == 0){
                System.out.println(i);
            }
        }

                //or
        for(int i = 1; i*i <= n; i++){                           //here the i*i is the replacement of sqrroot of i... means instead of i*i, we can all write i<=sqrot i.
            if(n % i == 0){
                System.out.println(i);
            if((n / i) != i){
                System.out.println(n / i);
            }
        
        }
    }
    }
}
