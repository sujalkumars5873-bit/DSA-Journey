public class reversr_a_no {
    public static void main(String[] args) {
        int n =113400; 
        int rev = 0;
        while(n>0){
            int lastdigit  = n % 10;
            n = n / 10;
            rev = (rev*10) + lastdigit;
        }

        System.out.println("The reverse of no. is: " + rev);
    }
}
