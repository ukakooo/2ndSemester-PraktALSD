package Exp1;

public class SortingMain16 {
    public static void main(String[] args) {
        int[] a = {34, 7, 23, 32, 5, 62};
        int[] b = {30, 20, 2, 8, 14};
        int[] c = {40, 10, 4, 9, 3};

        Sorting16 sorting = new Sorting16(a);
        System.out.println("Original array:");
        sorting.print();
        sorting.bubbleSort();
        System.out.println("Sorted array (Bubble Sort): ");
        sorting.print();
        System.out.println();
        
        Sorting16 sorting2 = new Sorting16(b);
        System.out.println("Original array:");
        sorting2.print();
        sorting2.selectionSort();
        System.out.println("Sorted array (Selection Sort): ");
        sorting2.print();
        System.out.println();

        Sorting16 sorting3 = new Sorting16(c);
        System.out.println("Original array:");
        sorting3.print();
        sorting3.insertionSort();
        System.out.println("Sorted array (Insertion Sort): ");
        sorting3.print();
        System.out.println();
    }
}
