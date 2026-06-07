
import java.util.ArrayList;

public class intersection_of_2_sorted_arr {
    public static void main(String[] args) {

        int nums1[] = {1,2,2,3,3,4,5,6};
        int nums2[] = {2,3,3,5,6,7};

        int n1 = nums1.length;
        int n2 = nums2.length;
        
        int i = 0;
        int j = 0;

        ArrayList<Integer> intersection = new ArrayList<>();

        while(i < n1 && j < n2){
            if(nums1[i] < nums2[j]){
                i++;
            }
            
            else if(nums2[j] > nums1[i]){
                j++;
            }
            
            else{
                intersection.add(nums1[i]);
                i++;
                j++;
            }
        }

        
        System.out.print(intersection);

    }
}
