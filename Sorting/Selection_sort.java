
import java.util.Scanner;


public class Selection_sort {

    public static void selection_sorting(int arr[],int n){
        for(int i = 0; i<=n-1; i++){
            int mini = i;
            for(int j = i+1; j<=n-1; j++){
                if(arr[j] < arr[mini]){
                    mini = j ;
                }
            }

            //swaping 
            int temp = arr[mini];
            arr [mini] = arr[i];
            arr[i] = temp;


        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        selection_sorting(arr, n);

        //output
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
