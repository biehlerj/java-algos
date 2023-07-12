package leetcode_array;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) result ^= num;
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{2, 2, 1}, nums2 = new int[]{4, 1, 2, 1, 2}, nums3 = new int[]{1};
        System.out.println(singleNumber(nums1));
        System.out.println(singleNumber(nums2));
        System.out.println(singleNumber(nums3));
    }
}
