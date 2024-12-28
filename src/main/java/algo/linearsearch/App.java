package algo.linearsearch;

public class App {

    public static void main(String[] args) {
        LinearSearch linearSearch = new LinearSearch();
        System.out.println(linearSearch.linearSearch(new int[]{1, 3, 4, 5, 6}, 5));
        System.out.println(linearSearch.linearSearch(new int[]{1, 3, 4, 5, 6}, 50));
    }
}

