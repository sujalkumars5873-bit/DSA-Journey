public class count_no {
    public static void main(String[] args) {
        int num = 778989;
        int count = 0;
        System.out.println("number: " + num);
        while(num>0)
            int lastdigit = num % 10;        ///it is the last digit of the num given //
            count = count+1;
            num = num / 10;
        }
        System.out.println("total digits : "  + count);
    }
}
