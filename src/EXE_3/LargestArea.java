package EXE_3;

public class LargestArea {

    public static int LargestAreaCalc(int [] lst){
        if (lst.length == 0){
            return 0;
        }
        int n = lst.length;
        int[] Stack = new int[n+1];
        int best = 0;
        int top = -1;

        for (int i = 0; i <= n; i++) {
            int curr = (i == n) ? 0 : lst[i];

            while (top >= 0 && curr < lst[Stack[top]]){
                int h = lst[Stack[top--]];
                int right = i;
                int left = (top >= 0) ? Stack[top] : -1;
                int width = right - left - 1;
                best = Math.max(best , h * width);

            }
            Stack[++top] = i;

        }

        return best;



    }
}
