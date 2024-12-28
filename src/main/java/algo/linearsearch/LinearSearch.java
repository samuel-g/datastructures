package algo.linearsearch;

//O(n)
public class LinearSearch {

    public int linearSearch(int[] array, int value) {
        int answer = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return answer;
    }
}
