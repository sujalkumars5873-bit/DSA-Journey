public class butterfly_pattern {
    public static void main(String[] args) {
        int m = 4;
        //upper part
        for(int i = 1; i<=m; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            for(int j = 1; j<=(m-i)*2; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();    
        }

        //lower part

        for(int i = m; i>=1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            for(int j = 1; j<=(m-i)*2; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
