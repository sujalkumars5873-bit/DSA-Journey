public class count_no {
    public static void main(String[] args) {
        int num = 778989;
        int count = 0;
        System.out.println("number: " + num);
        for(int i = 0; i<num; i++){
            count = count+1;
            num = num / 10;
        }
        System.out.println("total digits : "  + count);
    }
}
