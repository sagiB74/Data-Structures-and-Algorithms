package Recursion.jave;

public class Main {
    static void main(String[] args) {
//        int[] arr = {100,45,77,3,24,16};
//        QuickSort.QuickSort(arr,0,arr.length-1);
//        for (int x : arr) {
//            System.out.print(x + " ");
//        }
//        System.out.println("\n");

        int[] arr1 = {4,2,2,8,3,3,1,10,9};
//        InsertionSort.insertionSort(arr1);
//        for (int y : arr1){
//            System.out.print(y + " ");
//        }

        int[] sorted = CountingSort.countingSort(arr1,11);
        for (int x : sorted){
            System.out.println(x + " ");
        }


    }
}
