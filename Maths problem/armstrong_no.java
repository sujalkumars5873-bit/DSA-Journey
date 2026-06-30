public class armstrong_no {
    public static void main(String[] args) {
        int n = 153;
        int dup = n;
        int sum = 0;

        while(n > 0){
            int lastdigit = n % 10;
            n = n / 10;
            sum = (sum) + (lastdigit*lastdigit*lastdigit);
        }
        if(dup == sum){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
