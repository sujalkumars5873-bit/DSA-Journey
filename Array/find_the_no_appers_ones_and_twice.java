public class find_the_no_appers_ones_and_twice {
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,3,4,4};
        int n = arr.length;

        for(int i = 0; i<n; i++){
            int ctr = 0;
            for(int j = 0; j<n; j++){
                if(arr[j] == arr[i]){
                    ctr++;
                }
            }
            if(ctr == 1){
                System.out.println(arr[i]);
            }
        }
    }
}
