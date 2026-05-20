//question 2
// Shelley Monis ID: 213788433 , Sagi Benilush ID: 322566845

package EXE_3;

import java.util.Arrays;
import java.util.Random;


public class CountingSortSol {

    public static void main(String[] args) {
        int[] arr = createRandomArray();
        System.out.println("n = " + arr.length);
        System.out.println("Original: " + Arrays.toString(arr));


        // ===== Student method (TODO inside) =====
        countingSortRangeNegToPos(arr);

        System.out.println("Sorted:   " + Arrays.toString(arr));
    }




    public static void countingSortRangeNegToPos(int[] arr) {
        if (arr == null || arr.length <= 1) return;
        int n = arr.length;

        int min = arr[0], max = arr[0];
        for (int x : arr) {
            if (x < min) min = x;
            if (x > max) max = x;
        }

        int range = max - min + 1;
        int[] count = new int[range];

        for (int num : arr){
            count[num - min]++;
        }

        for (int i = 1; i <range ; i++) {
            count[i] += count[i-1];

        }
        int[] output = new int[arr.length];

        for (int i = arr.length -1; i >= 0; i-- ){
            int index = arr[i] - min;
            output[ count[ index ] -1 ] = arr[i];
            count[index] --;
        }
        System.arraycopy(output, 0, arr, 0, arr.length);




    }

    /* --------------------- Utility: randomization --------------------- */

    // Create random array with random length in [5, 50], values in [-n, n]


    private static int[] createRandomArray() {
        Random rnd = new Random();
        int n = rnd.nextInt(10) + 5;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            // uniform in [-n, n]
            arr[i] = rnd.nextInt(2 * n + 1) - n;
        }
        return arr;
    }
}
