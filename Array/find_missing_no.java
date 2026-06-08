public class find_missing_no {
    public static void main(String[] args) {
        
        int arr[] = {1,2,4,5};
        
        int n = 5;
        int a = arr.length;
                                                     //from linear search
        
        // for(int i = 1; i<n; i++){
        //     int flag = 0;
        //     for(int j = 0; j<n-1; j++){
        //         if(arr[j] == i){
        //              flag = 1;
        //             break;
        //         }
        //     }
        //     if (flag == 0) {
        //         System.out.println(i);
        //     }
        // }


                                                     //from summing all no.s

        int sum1 = n*(n+1)/2;  //sum of all no upto n.
        int sum2 = 0;
        int missingNo;

        for(int i = 0; i<a; i++){
            sum2 = sum2 + arr[i];    //for example if i ==> 0, then sum2 willl be (0 + 1) where 1 is the arr[i].
        }

        missingNo = sum1 - sum2;
        System.out.println("The missing no. in array is: " + missingNo);
    }
}
