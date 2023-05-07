/**
 * Implementation of binary search algorithm in Java
 * 
 * @author Jacob Biehler (https://github.com/biehlerj)
 */
class BinarySearch {
        /**
         * @param arr    is the array to search
         * @param arrLen is the length of the array
         * @param target is the item to find
         * @return index of the element or -1 if not found
         */
        int binarySearch(int arr[], int arrLen, int target) {
                int left = 0;
                int right = arrLen - 1;

                while (left <= right) {
                        int middle = (int) Math.floor((left + right) / 2);

                        if (arr[middle] < target) {
                                left = middle + 1;
                        } else if (arr[middle] > target) {
                                right = middle - 1;
                        } else {
                                return middle;
                        }
                }
                return -1;
        }

        // Driver method to test above
        public static void main(String args[]) {
                BinarySearch ob = new BinarySearch();
                int arr[] = { 2, 3, 4, 10, 40 };
                int arrLen = arr.length;
                int target = 10;
                int result = ob.binarySearch(arr, arrLen, target);
                if (result == -1)
                        System.out.println("Element not present");
                else
                        System.out.println("Element found at "
                                        + "index " + result);
        }
}
