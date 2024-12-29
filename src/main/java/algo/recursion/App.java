package algo.recursion;

public class App {

    public static void main(String[] args) {
        reduceByOne(3);
        System.out.println("recursiveLinearSearch-");
        int[] arr = {1, 3, 4, 5, 6, 8, 9};
        System.out.println(recursiveLinearSearch(arr, 0, 5));
        System.out.println("recursiveBinarySearch-");
        System.out.println(recursiveBinarySearch(arr, 0, arr.length, 9));
    }

    public static void reduceByOne(int n) {
        if (n >= 0) { //Base case
            reduceByOne(n - 1);
        }
        System.out.println("Completed Call: " + n);
    }

    public static int recursiveLinearSearch(int[] arr, int i, int value) {

        if (i > arr.length - 1) { //base case: if evaluates to true, value not found in array
            return -1;
        } else if (arr[i] == value) {
            return i;
        } else {
            System.out.println("index: " + i);
            return recursiveLinearSearch(arr, i + 1, value);
        }
    }

    public static int recursiveBinarySearch(int[] arr, int begin, int end, int value) {
        System.out.println("[" + begin + "..." + end + "]");
        if (begin > end) { //base case
            return -1;
        } else {
            int mid = (begin + end) / 2;
            if (arr[mid] == value) {
                return mid;
            } else if (arr[mid] > value) {
                return recursiveBinarySearch(arr, begin, mid - 1, value);
            } else {
                return recursiveBinarySearch(arr, mid + 1, end, value);
            }
        }
    }

}