package ds.queue;

import java.util.*;

public class ReverseBElements {

    public static void main(String[] args) {
        ReverseBElements reverseBElements = new ReverseBElements();
        Map<int[], Integer> testCases = new HashMap<>();
        testCases.put(new int[]{1, 2, 3, 4, 5}, 3);
        testCases.put(new int[]{1, 2, 3, 4}, 4);
        testCases.put(new int[]{5, 6, 7}, 1);
        testCases.put(new int[]{10, 20, 30, 40, 50}, 0);

        // Automated validation
        for (Map.Entry<int[], Integer> testCase : testCases.entrySet()) {
            System.out.printf("Input: %s, B: %d%n", Arrays.toString(testCase.getKey()), testCase.getValue());
            int[] result = reverseBElements.reverseBElements(testCase.getKey(), testCase.getValue());
            System.out.printf("Result: %s%n%n", Arrays.toString(result));
        }

    }

    public int[] reverseBElements(int[] arr, int B) {
        if (B <= 0 || arr == null || arr.length == 0) {
            return arr; // No reversal needed
        }

        // Create a queue with a capacity of B
        Queue<Integer> myQueue = new LinkedList<>();

        // Step 1: Enqueue the first B elements
        for (int i = 0; i < B; i++) {
            myQueue.add(arr[i]);
        }

        // Step 2: Dequeue from the queue and update the array with reversed elements
        for (int i = B - 1; i >= 0; i--) {
            arr[i] = myQueue.remove();
        }

        // Return the modified array
        return arr;
    }
}
