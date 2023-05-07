/**
 * Implementation of binary search algorithm in Java
 * 
 * @author Jacob Biehler (https://github.com/biehlerj)
 */
class JumpSearch {
  /**
   * @param arr    is the array to search
   * @param arrLen is the length of the array
   * @param target is the item to find
   * @return index of the element or -1 if not found
   */
  int jumpSearch(int arr[], int arrLen, int target) {
    int jump = (int) Math.floor(Math.sqrt(arrLen));
    int lower = 0;

    for (int minStep = Math.min(jump, arrLen) - 1; arr[minStep] < target; minStep = Math.min(jump, arrLen) - 1) {
      lower = jump;
      jump += (int) Math.floor(Math.sqrt(arrLen));

      if (lower >= arrLen)
        return -1;
    }

    while (arr[lower] < target) {
      lower++;
      if (lower == Math.min(jump, arrLen))
        return -1;
    }

    if (arr[lower] == target)
      return lower;
    return -1;
  }

  public static void main(String args[]) {
    JumpSearch js = new JumpSearch();
    int arr[] = { 2, 3, 4, 10, 40 };
    int arrLen = arr.length;
    int target = 10;
    int result = js.jumpSearch(arr, arrLen, target);
    if (result == -1)
      System.out.println("Element not present");
    else
      System.out.println("Element found at "
          + "index " + result);
  }
}
