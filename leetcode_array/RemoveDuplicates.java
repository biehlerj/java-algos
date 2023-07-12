package leetcode_array;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums.length < 2)
            return nums.length;
        int i = 1, j = 0;
        while (i < nums.length) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
            i++;
        }
        return j + 1;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[] { 1, 1, 2 };
        int[] nums2 = new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

        System.out.println(removeDuplicates(nums1));
        System.out.println(removeDuplicates(nums2));
    }
}