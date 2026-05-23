
public class largest_element_in_array {

    public static int largestelement(int arr[]){
        int largest = arr[0];

        for(int i = 0; i<arr.length; i++){
            if(arr[i]> largest){
                largest = arr[i];
            }
        }
        return largest;

    }
    public static void main(String[] args) {
        int arr[] = {1,2,12,7,4,9};

        System.out.println(largestelement(arr));
    }
    
}
