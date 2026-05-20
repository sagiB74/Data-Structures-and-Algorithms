package TestPractice;

public class Histo2 {
    public int HistoCalc(int[] arr){
        if (arr == null || arr.length == 0){
            return 0;
        }
        int[] stack = new int[arr.length];
        int top = -1;
        int best = 0;



        for (int i = 0; i <= arr.length; i++) {
            int current = (i == arr.length) ? 0 : arr[i];

            while (top >= 0 && current < arr[stack[top]] ){
                int h = arr[stack[top--]];
                int right = i;
                int left = (top >= 0) ? stack[top] : -1;
                int width = right - left - 1;
                best = Math.max(best , h * width);


            }

            stack[++top] = i;

        }

        return best;
    }


}
