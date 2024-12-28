package algo.binarysearch;

import algo.linearsearch.LinearSearch;

public class App {

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.binarySearch(new int[]{1, 3, 4, 5, 6}, 5));
        System.out.println(binarySearch.binarySearch(new int[]{1, 3, 4, 5, 6}, 50));
    }
}

