public class remove_duplicate_from_arr {


    public static int removeduplicate(int arr[]){
        int i = 0;

        for (int j = 1; j< arr.length; j++){
            if(arr[j] != arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;

    }
    public static void main(String[] args) {
        
        int arr[] = {1,1,2,2,4,4,5,5};

        int newlength = removeduplicate(arr);

        for(int i = 0; i<newlength; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
