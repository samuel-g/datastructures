package algo.selectionsort;

public class App {

    public static void main(String[] args) {
        System.out.println("selectionSort-");
        int[] arr = {4, 2, 0, 9, 5, 6, 3, 8};
        int[] sortedArr = selectionSort(arr);
        for (int j : sortedArr) {
            System.out.print(j + " ");
        }
    }

    private static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;

                }
            }
            System.out.println("Swapping: " + arr[i] + " & " + arr[minIndex]); //swap once at the end of the loop.
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;

    }
}
