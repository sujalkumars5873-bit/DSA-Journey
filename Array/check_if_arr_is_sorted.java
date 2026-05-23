public class check_if_arr_is_sorted {
    public static boolean  checksorting(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>= arr[i-1]){
        
            } else {
                return false;
            }
        }
        return true;
      
    }
    public static void main(String[] args) {
        int arr[] = {1,3,5,7};

        System.out.println(checksorting(arr));
        
    }
}
