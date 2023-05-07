/**
 * Implementation of linear search algorithm in Java
 * 
 * @author Jacob Biehler (https://github.com/biehlerj)
 */
class LinearSearch {
    /**
     * @param arr    is the array to search
     * @param arrLen is the length of the array
     * @param target is the item to find
     * @return index of the target or -1 if not found
     */
    int linearSearch(int arr[], int arrLen, int target) {
        for (int i = 0; i < arrLen; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        LinearSearch ls = new LinearSearch();
        int arr[] = { 2, 3, 4, 10, 40 };
        int arrLen = arr.length;
        int target = 10;
        int result = ls.linearSearch(arr, arrLen, target);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at "
                    + "index " + result);
    }
}