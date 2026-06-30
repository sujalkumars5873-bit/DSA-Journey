public class palindrom_no {
    public static void main(String[] args) {
        int n = 1338;
        int dup = n;
        int rev = 0;


        while(n>0){
            int lastdigit = n % 10;
            n = n / 10;
            rev = (rev*10) + lastdigit;
        }

        if (dup == rev) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
