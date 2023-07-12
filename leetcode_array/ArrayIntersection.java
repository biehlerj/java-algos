package leetcode_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ArrayIntersection {
    public static int[] intersect(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0)
            return new int[0];
        HashMap<Integer, Integer> intersectionMap = new HashMap<>();
        for (int num : nums1)
            if (intersectionMap.containsKey(num))
                intersectionMap.put(num, intersectionMap.get(num) + 1);
            else
                intersectionMap.put(num, 1);
        List<Integer> result = new ArrayList<>();

        for (int num : nums2) {
            if (intersectionMap.containsKey(num) && intersectionMap.get(num) > 0) {
                result.add(num);
                int freq = intersectionMap.get(num);
                freq--;
                intersectionMap.put(num, freq);
            }
        }

        return listToArray(result);
    }

    private static int[] listToArray(List<Integer> list) {
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] ex1Nums1 = new int[]{1, 2, 2, 1}, ex1Nums2 = new int[]{2, 2};
        int[] ex2Nums1 = new int[]{4, 9, 5}, ex2Nums2 = new int[]{9, 4, 9, 8, 4};

        System.out.println(Arrays.toString(intersect(ex1Nums1, ex1Nums2)));
        System.out.println(Arrays.toString(intersect(ex2Nums1, ex2Nums2)));
    }
}
