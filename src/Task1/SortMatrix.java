// sagi benilush and shelley monis
package Task1;

import java.util.Arrays;

public class SortMatrix {
    public void SortDiagonal(int[][] matrix){
        int row = matrix[0].length;
        for (int i = 0; i < matrix.length -1; i++){
            for (int j = 0; j < matrix.length -1 - i; j++) {
                int current = matrix[j][j];
                int next = matrix[j+1][j+1];
                if (current > next){
                    int temp = next;
                    matrix[j+1][j+1] = current;
                    matrix[j][j] = temp;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));

        }
    }

}
