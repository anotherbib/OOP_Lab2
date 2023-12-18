public class Main {
    public static void main(String[] args) {
        SortingAlgorithm s = new SelectionSort();
        s.sort();
        
        s = new MergeSort();
        s.sort();

        s = new InsertionSort();
        s.sort();
    }
}
