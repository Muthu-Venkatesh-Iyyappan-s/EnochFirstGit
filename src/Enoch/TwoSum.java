package Enoch;
import java.util.*;
class TwoSum{
    public static int[] twoSum(int[] nums, int target) 
    {
        int[] indices = new int[2];
        for (int i = 0; i < nums.length; i++)
         {
            int complement = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) 
            {
                if (nums[j] == complement)
                 {
                    indices[0] = i;
                    indices[1] = j;
                    return indices;
                }
            }
        }
            return new int[0];
    }

    public static void main(String[] args) 
    {
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = twoSum(nums1, target1);
        System.out.println(result1[0] + ", " + result1[1]);  

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = twoSum(nums2, target2);
        System.out.println(result2[0] + ", " + result2[1]); 

        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = twoSum(nums3, target3);
        System.out.println(result3[0] + ", " + result3[1]); 
    }
}
