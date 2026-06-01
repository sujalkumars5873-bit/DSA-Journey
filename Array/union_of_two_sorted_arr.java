
import java.util.ArrayList;

public class union_of_two_sorted_arr {
    public static void main(String[] args) {
        
        int nums1[] = {1,2,3,3,4};
        int nums2[] = {1,2,2,3,4,7,7,8};
        
        int n1 = nums1.length;
        int n2 = nums2.length;

        int i = 0;
        int j = 0;

        ArrayList<Integer> union = new ArrayList<>();

        while(i<n1 && j<n2){             //for comparing both arr till the end of arr.
            if(nums1[i] <= nums2[j]){    //if the ele of 1st arr is smaller or equal fron 2nd arr then, take it for union arr.
                if(union.size() == 0 ||
                 union.get(union.size()-1) != nums1[i]){     //this check if last element of union arr is not equal to the 1st arr ele.
                    union.add(nums1[i]);         //add the unique element to union arr.
                }
                i++;


            } else{
                if(union.get(union.size()-1) != nums2[j]){     
                    union.add(nums2[j]);         
                }
                j++;
            }
        }

        while(j<n2){                                  //if the 1st arr ends this will add remaing element to the union arr.
            if(union.get(union.size()-1) != nums2[j]){     
                    union.add(nums2[j]);         
                }
                j++;
        }

        while(i<n1){                                 ////if the 2nd arr ends this will add remaing element to the union arr.
            if(union.get(union.size()-1) != nums1[i]){     
                    union.add(nums1[i]);         
                }
                i++;
        }
        

        System.out.println(union);
    }
}
