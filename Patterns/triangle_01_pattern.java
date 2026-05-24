public class triangle_01_pattern {
    public static void main(String[] args) {
        int m = 5;
        for(int i = 1; i<=m; i++){
            for(int j = 1; j<=i; j++){
                int sum = i+j;           //if the sum is even => print 1 else print 0
                                        //and "sum" is the sum of rows and coloumn
                if( sum % 2 == 0){      //even
                    System.out.print("1");
                } else{                 //odd
                    System.out.print("0");
                }
            }
            System.out.println();

        }
    }
}
