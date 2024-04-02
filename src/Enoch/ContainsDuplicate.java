package Enoch;
import java.util.HashMap;
public class ContainsDuplicate {
        public static boolean containsNearbyDuplicate(int[] nums, int k) 
        {
        if (nums == null || nums.length == 0 || k <= 0) 
        {
            return false;
        }

        for (int i = 0; i < nums.length - 1; i++) 
        {
            for (int j = i + 1; j < nums.length && j - i <= k; j++) 
            {
                if (nums[i] == nums[j]) 
                {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) 
    {
        int[] nums1 = {1, 2, 3, 1};
        int k1 = 3;
        System.out.println("k = 3: " + containsNearbyDuplicate(nums1, k1)); 

        int[] nums2 = {1, 0, 1, 1};
        int k2 = 1;
        System.out.println("k = 1: " + containsNearbyDuplicate(nums2, k2)); 

        int[] nums3 = {1, 2, 3, 1, 2, 3};
        int k3 = 2;
        System.out.println("k = 2: " + containsNearbyDuplicate(nums3, k3)); 
    }
}