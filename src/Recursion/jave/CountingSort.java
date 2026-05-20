package Recursion.jave;

public class CountingSort {
    public static int[] countingSort(int[] arr , int MaxSize){
        int []back = new int[arr.length];
        int[] countArr = new int [MaxSize];

        for (int x : arr){
            countArr[x]++;
        }

        for (int i = 1; i < countArr.length; i++){
            countArr[i] += countArr[i-1];
        }

        for (int i = arr.length -1; i >= 0; i-- ){
            back[ countArr[ arr[i] ] -1 ] = arr[i];
            countArr[arr[i]] --;
        }

        return back;
    }
}
