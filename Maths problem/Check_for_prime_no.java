public class Check_for_prime_no {
    public static void main(String[] args) {
        int n = 3;
        int cnt = 0;

        for(int i = 1; i*i<=n; i++){            // to understand (i*i) see ...print_all_the_divisors file
            if(n % i == 0){
                cnt++;
                if(n / i != i){
                    cnt++;
                }
            }
        }
        if(cnt == 2){
                System.out.println("prime");
            }
            else{
                System.out.println("not prime");
            }


    }
}
