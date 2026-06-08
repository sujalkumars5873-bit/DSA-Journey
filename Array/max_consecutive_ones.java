public class max_consecutive_ones {
    public static void main(String[] args) {
        

        int arr[] ={1,1,0,1,1,1,0,1,1};
        int cnt = 0;
        int max = 0;
        int n =arr.length;


        for(int i = 0; i<n; i++){
            if(arr[i] == 1){
                cnt++;
                max = Math.max(max,cnt);     //"math.max" will take the maximum no. which will come in the "max" variable.
            }
            else{
                cnt = 0; 
            }
        }
        System.out.println("max consecutive ones is: " + max);
    }
}
