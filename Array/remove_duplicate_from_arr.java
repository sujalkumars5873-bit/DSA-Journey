public class remove_duplicate_from_arr {


    public static int removeduplicate(int arr[]){
        int j = 0;

        for (int i = 1; i< arr.length; i++){
            if(arr[j] != arr[i]){
                arr[j+1] = arr[i];
                j++;
            }
        }
        return j+1;

    }
    public static void main(String[] args) {
        
        int arr[] = {1,1,2,2,4,4,5,5};

        int newlength = removeduplicate(arr);

        for(int i = 0; i<newlength; i++){
            System.out.print(arr[i] + " ");
        }

    }
}



