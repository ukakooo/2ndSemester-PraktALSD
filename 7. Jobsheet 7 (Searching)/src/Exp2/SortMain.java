package Exp2;

public class SortMain {
    public static void main(String[] args) {
        int array[] = {10, 40, 30, 50, 70, 20, 100, 90};
        MergeSort sort = new MergeSort();

        System.out.println("Sorting with merge sort");
        System.out.println("Initial Data");
        sort.printArray(array);

        //Sorting
        sort.mergeSort(array);
        System.out.println("Sorted Data");
        sort.printArray(array);
    }
}
