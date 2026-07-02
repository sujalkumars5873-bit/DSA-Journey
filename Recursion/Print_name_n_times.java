public class Print_name_n_times {

    public static void printname(int i, int n){
        if(i>n){
            return;
        }
        else{
            System.out.println("krish");
            printname(i+1, n);
        }
    }
    public static void main(String[] args) {
        int n = 4;
        printname(1, n);
    }
}
