public class linear_search {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5};
        int number = 10;
        int n = nums.length;

        for(int i = 0; i<n; i++){
            if(nums[i] == number){
                System.out.println("Index no. of number is: " + i);
            } else{
                System.out.println("The no. dosen't exist in array!!");
            }
            break;
        }
    }
}
