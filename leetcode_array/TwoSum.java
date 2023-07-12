package leetcode_array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums1 = new int[]{2, 7, 11, 15}, nums2 = new int[]{3, 2, 4}, nums3 = new int[]{3, 3};
        int target1 = 9, target2 = 6, target3 = 6;

        System.out.println(Arrays.toString(twoSum(nums1, target1)));
        System.out.println(Arrays.toString(twoSum(nums2, target2)));
        System.out.println(Arrays.toString(twoSum(nums3, target3)));
    }

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> sumMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (sumMap.containsKey(complement))
                return new int[]{sumMap.get(complement), i};
            sumMap.put(nums[i], i);
        }
        return null;
    }
}
