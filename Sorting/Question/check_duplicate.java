public class check_duplicate {

    public static boolean checkdup(int nums[],int n){

        //by selection sort

        //sorting
        for(int i = 0; i<n-1; i++){
            int mini = i;
            for(int j = i+1; j<=n-1; j++){
                if(nums[j] < nums[mini]){
                    mini = j;
                }
            }

            //swap
            int temp = nums[mini];
            nums[mini] = nums[i];
            nums[i] = temp;
        }

        //check duplicate
        int ctr = 0;
        for(int i = 1; i<n; i++){
            if(nums[i] == nums[i-1]){
                return true;
            }
        }
        return false;
        
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        int n = nums.length;
        

        System.out.println(checkdup(nums, n));
    }
}
