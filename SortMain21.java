/**
 * SortMain21
 */
public class SortMain21 {

    public static void main(String[] args) {
        int[] numberValues = {10, 40, 30, 50, 70, 20, 100, 90};

        System.out.println("Sorting with merge sort");
        
        MergeSorting21 sort = new MergeSorting21();

        System.out.println("===============================");
        System.out.println("Initial Data");
        sort.printArray(numberValues);
        sort.MergeSorting(numberValues);

        System.out.println("===============================");
        System.out.println("Sorted Data");
        sort.printArray(numberValues);

        System.out.println("===============================");
    }
}