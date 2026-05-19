public class floyd {
    public static void main(String[] args) {
        int m = 5;
        int number = 1;
        for(int i = 1; i<=m; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(number + " ");
                number++; ///number is increased by 1 for next step
            }
            System.out.println();

        }
    }
    
}
