package ua.stepanchuk;

public final class BinarySearch {
  public static Integer find(int[] array, int elem) {
    int low = 0;
    int high = array.length - 1;

    while (low <= high) {
      int mid = (low + high) / 2;
      int guess = array[mid];
      if (guess == elem) {
        return mid;
      } else if (guess > elem) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }

    return null;
  }
}
