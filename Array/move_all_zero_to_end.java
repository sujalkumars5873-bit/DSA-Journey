public class move_all_zero_to_end {

    public static void movezero(int nums[]){
        int n = nums.length;
        int j = -1;
        int temp;

        for(int i = 0; i<n; i++){
            if(nums[i] == 0){
                j = i;
                break;
            }
            if(j == -1){
                return;
            }
        }


        for(int i = j+1; i<n; i++){
            if(nums[i] != 0){
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        
        int nums[] = {0,1,2,3,0,4,0,0,0,5,0,1,0};

        movezero(nums);

        for(int i = 0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }

    }
}
