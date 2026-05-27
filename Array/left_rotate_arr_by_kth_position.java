public class left_rotate_arr_by_kth_position {


    public static void rotate(int nums[],int d){
         
        d = d % nums.length;       //reduced the rotation under arr length

        int temp[] = new int[d];    //deleared temp arr

        for(int i = 0; i<d; i++){    //storing elements in temp arr
            temp[i] = nums[i];
        }

         for(int i = d; i<nums.length; i++){         //shifting elements to left  
            nums[i-d] = nums[i];
         }

         for(int i = nums.length - d; i<nums.length; i++){
            nums[i] = temp[i - (nums.length - d)];
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
