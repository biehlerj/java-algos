package leetcode_sorting_searching;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int[] ex1Nums1 = new int[]{1, 2, 3, 0, 0, 0}, ex1Nums2 = new int[]{2, 5, 6};
        int[] ex2Nums1 = new int[]{1}, ex2Nums2 = new int[]{};
        int ex1M = 3, ex1N = 3, ex2M = 1, ex2N = 0;

        merge(ex1Nums1, ex1M, ex1Nums2, ex1N);
        merge(ex2Nums1, ex2M, ex2Nums2, ex2N);

        System.out.println(Arrays.toString(ex1Nums1));
        System.out.println(Arrays.toString(ex2Nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j])
                nums1[k--] = nums1[i--];
            else
                nums1[k--] = nums2[j--];
        }
    }
}
