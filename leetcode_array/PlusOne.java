package leetcode_array;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits1 = new int[]{1, 2, 3}, digits2 = new int[]{4, 3, 2, 1}, digits3 = new int[]{9};
        int[] failing = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        System.out.println(Arrays.toString(plusOne(digits1)));
        System.out.println(Arrays.toString(plusOne(digits2)));
        System.out.println(Arrays.toString(plusOne(digits3)));
        System.out.println(Arrays.toString(plusOne(failing)));
    }

    private static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
