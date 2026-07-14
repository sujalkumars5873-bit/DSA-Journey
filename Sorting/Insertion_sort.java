public class Insertion_sort {
    public static void main(String[] args) {
        int arr[] = {6,5,4,3,2,1};
        int n = arr.length;


        for(int i = 0; i<n; i++){
            int j = i;
            while(j>0 && arr[j-1] > arr[j]){
                //swap
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;

                j--;
            }
        }

        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
