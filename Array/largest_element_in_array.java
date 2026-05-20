
import java.util.Scanner;

public class largest_element_in_array {
    public static void main(String[] args) {
        System.out.println("Enter total no. of index of array: ");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();

        int arr[] = new int[index];//declearing array

        System.out.println("enter values: ");
        
        //input
        for (int i = 0; i < index; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];//letting largest value be in index no.1

        //output
        for(int i = 0; i<index; i++){
           if(arr[i]>largest){
            largest = arr[i];
           }
        }
        System.out.println("largest value is : " + largest);
    }
    
}
