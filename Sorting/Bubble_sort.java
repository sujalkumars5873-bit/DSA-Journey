public class Bubble_sort {

    public static void bubblesort(int arr[],int n){

        //sorting
        for(int i = n-1; i>=1; i--){

            for(int j = 0; j<=i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,3,2,7,4,0,1};
        int n = arr.length;

        bubblesort(arr, n);

        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
