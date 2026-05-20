package TestPractice;

public class TempHistogram {
    public int[] TempCalc(int [] lst){
        int n = lst.length;
        int[] s1 = new int[n];
        int[] result = new int[n];
        int top = -1;

        for (int i = 0; i < n; i++) {
            int current = lst[i];

            while (top >= 0 && current > lst[s1[top]]){
                int index = s1[top--]; // pop
                result[index] = i - index;

            }

            s1[++top] = i;



        }

        return result;
    }
}
