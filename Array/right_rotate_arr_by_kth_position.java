public class right_rotate_arr_by_kth_position {

    public static void rotate(int nums[],int d){
         int n = nums.length;
        d = d % n;       //reduced the rotation under arr length

        int temp[] = new int[d];    //deleared temp arr

        for(int i = 0; i<d; i++){    //storing elements in temp arr
            temp[i] = nums[n-d+i];
        }

         for(int i = n-d-1; i>=0; i--){         //shifting elements to left  or rotating rotating
            nums[i+d] = nums[i];
         }

         for(int i = 0; i<d; i++){
            nums[i] = temp[i];
         }



    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7};
        int d = 3;

        rotate(nums, d);

        for(int i = 0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
