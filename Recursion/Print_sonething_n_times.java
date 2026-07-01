

public class Print_sonething_n_times {

    public static void printone(int cnt){
        
        if(cnt == 4){
            return;
        }
        else{
            System.out.println("one");
            cnt++;
            printone(cnt);
        }
    } 
    public static void main(String[] args) {
        int cnt = 0;
        printone(cnt);
    }
}
