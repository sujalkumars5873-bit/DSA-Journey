public class right_rotate_arr_by_kth_position {

    public static void rotate(int nums[],int d){
         int n = nums.length;
        
            k = k % n;       //reduced the rotation under arr length

        int temp[] = new int[k];    //deleared temp arr

        for(int i = 0; i<k; i++){    //storing elements in temp arr
            temp[i] = nums[n-k+i];
        }

         for(int i = n-k-1; i>=0; i--){         //shifting elements to right  
            nums[i+k] = nums[i];
         }

         for(int i = 0; i<k; i++){
            nums[i] = temp[i];
         }



    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7};
        int k = 3;

        rotate(nums, k);

        for(int i = 0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
