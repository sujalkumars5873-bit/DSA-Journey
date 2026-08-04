public class Kadanes_algo {

                            //Brute Force approch//

//     public static void main(String[] args) {
//         int nums[] = {2, 3, 5, -2, 7, -4};

//         int n = nums.length;

//         int max = Integer.MIN_VALUE;
//         int start = 0;
//         int end = 0;

//         for(int i = 0; i<n; i++){

//             for(int j = i; j<n; j++){

//                 int sum = 0;
//                 for(int k = i; k<=j; k++){
//                     sum += nums[k];
//                 }
//                 if(sum > max){
//                 max = sum;
//                 start = i;
//                 end = j;
//             }
//             }
//         }
//         System.out.println(max);
//         System.out.print("subarray: " );
//         for(int b = start; b<= end; b++){
//             System.out.print(nums[b] + " ");
//         }
//     }
// }
