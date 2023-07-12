package leetcode_array;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums1 = new int[]{0, 1, 0, 3, 12}, nums2 = new int[]{0};

        moveZeroes(nums1);
        moveZeroes(nums2);

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
    }

    private static void moveZeroes(int[] nums) {
        for (int lastNonZero = 0, i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
                swap(nums, lastNonZero++, i);
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
