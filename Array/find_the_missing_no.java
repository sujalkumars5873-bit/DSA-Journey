public class find_the_missing_no {
    public static void main(String[] args) {
        int nums[] = {0,2,3,1,4};
        int n = nums.length;
        
        //sorting 
        for(int i = 0; i<=n-1; i++){
           int mini = i;
            for(int j = i+1; j<=n-1; j++){
                if(nums[j] < nums[mini]){
                    mini = j;
                }
            }

            //swapping
            int temp = nums[mini];
            nums[mini] = nums[i];
            nums[i] = temp;
        }

        //sorting completed
        System.out.println("sorted Array =");
        for(int i = 0; i<n; i++){
            System.out.print(nums[i] + " ");
        }

        //find missing no.
        System.out.println();

        for(int i = 0; i<n; i++){
            if(nums[i] != i){
                System.out.println("missing no. is" + i);
            }
        }
        System.out.println("missing no. is: " + n);

    }
}
