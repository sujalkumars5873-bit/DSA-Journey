public class slargest_and_ssmallest_no {
    public static void main(String[] args) {
        int arr[] = {1,2,67,67,55};

        int largest = arr[0];
        int slargest = Integer.MIN_VALUE;

        for(int i = 0; i<arr.length; i++){
            if(arr[i]> largest){
                slargest = largest;
                largest = arr[i];
            } else if(arr[i]<largest && arr[i] >slargest){
                slargest = arr[i];
            }
        }
        System.out.println("slargest no. is: " + slargest);
        System.out.println("largest is : " + largest);


        int smallest = arr[0];
        int ssmallest = Integer.MAX_VALUE;

        for(int i = 0; i<arr.length; i++){
            if(arr[i]<smallest){
                ssmallest = smallest;
                smallest = arr[i];
            } else if(arr[i]> smallest &&  arr[i] < ssmallest){
                ssmallest = arr[i];
            }
        }
        System.out.println("smallest no. is: " + smallest);
        System.out.println("ssmallest no. is: " + ssmallest);
    }
}
