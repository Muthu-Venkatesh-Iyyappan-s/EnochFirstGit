package Enoch;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target)
    {
        if (nums == null || nums.length == 0) {
            return 0;
    }

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) 
        {
            int mid = low + (high - low) / 2;
            if(nums[mid] == target) 
            {
                return mid;
            } 
            else if(nums[mid] < target) 
            {
                low = mid + 1;
            }
            else 
            {
                high = mid - 1;
            }
        }

        return low;
    }

    public static void main(String[] args) 
    {
        int[] nums1 = {1, 3, 5, 6};
        int target1 = 5;
        System.out.println("target 5: " + searchInsert(nums1, target1)); 

        int[] nums2 = {1, 3, 5, 6};
        int target2 = 2;
        System.out.println("target 2: " + searchInsert(nums2, target2)); 

        int[] nums3 = {1, 3, 5, 6};
        int target3 = 7;
        System.out.println("target 7: " + searchInsert(nums3, target3)); 
    }
}