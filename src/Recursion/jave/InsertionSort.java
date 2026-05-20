package Recursion.jave;

public class InsertionSort {

   public static <T extends Comparable> T[] insertionSort(T[] data){
       int n = data.length;
       for (int i = 1;i < n; i++ ){
           T key = data[i];
           int j = i - 1;
           while (j >= 0 && data[j].compareTo(key) > 0){
               data[j +1 ] = data[j];
               j = j -1;
           }
           data[j+1] = key;
       }
       return data;
   }

}
