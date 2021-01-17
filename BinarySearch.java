import java.util.Arrays;
import java.util.Collections;

public class BinarySearch {
    static int binarySearch(Integer arr[], int key) {
        int low = 0;
        int high = arr.length - 1; // should be n-1

        while (low <= high) { // less than equal to high
            int mid = (low + high) >> 1;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; //return -1, if not found.
    }

    static int lowerBound(Integer arr[], int key) {
        int low = 0;
        int high = arr.length; // should be n

        while (low < high) { // less than high
            int mid = (low + high) >> 1;
            if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid; // arr[mid] == key and arr[mid] > key
            }
        }
        return low; // Lower index is returned, instead of mid
    }

    static int upperBound(Integer arr[], int key) {
        int low = 0;
        int high = arr.length; // should be n

        while (low < high) { // less than high
            int mid = (low + high) >> 1;
            if (arr[mid] <= key) { // Only this is different in lowerBound and UpperBound
                low = mid + 1;
            } else {
                high = mid; // arr[mid] == key and arr[mid] > key
            }
        }
        return low; // Lower index is returned instead of mid
    }

    public static void main(String args[]) {
        Integer arr[] = {1, 2, 3, 4, 5, 5, 5, 9, 10, 13, 15, 17, 17, 17, 17};
        int toSearch = 17;
        System.out.println(Arrays.binarySearch(arr, toSearch));
        System.out.println(Collections.binarySearch(Arrays.asList(arr), toSearch));
        System.out.println(binarySearch(arr, toSearch));
        System.out.println(lowerBound(arr, toSearch));
        System.out.println(upperBound(arr, toSearch));
    }
}
