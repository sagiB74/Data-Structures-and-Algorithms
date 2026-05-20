package Recursion.jave;

public class QuickSort {
    public static void QuickSort(int[] arr, int left, int right){
        if (left >= right){
            return;
        }
        int pivot = arr[right];
        int PartitionIndex = Partition(arr,left,right,pivot);
        QuickSort(arr,left,PartitionIndex-1);
        QuickSort(arr,PartitionIndex +1, right);


    }

    private static int Partition(int[] arr, int left, int right, int pivot) {
        int index = left -1;
        for (int j = left; j < right; j ++){
            if (arr[j] < pivot){
                index++;
                System.out.println("Before swap: ");
                System.out.println("arr[index] " + arr[index]);
                System.out.println("arr[j] " + arr[j]);

                Swap(arr,index,j);

                System.out.println("After swap: ");
                System.out.println("arr[index] " + arr[index]);
                System.out.println("arr[j] " + arr[j]);

            }

        }
        Swap(arr,index +1 ,right);
        return index +1;

    }

    private static void Swap(int[] arr, int index, int j) {
        int temp = arr[index];
        arr[index] = arr[j];
        arr[j] = temp;
    }
}
