package TestPractice;

public class StockSeq {
    public int[] stockCalc(int[] lst){
        int[] result = new int[lst.length];
        int[] stack = new int[lst.length];
        int top = -1;

        for (int i = 0; i < lst.length; i++) {
            int current = lst[i];

            while (top >= 0 && current >= lst[stack[top]]){
                top--;


            }
            if (top == -1){
                result[i] = i + 1;
            }else {

                result[i] = i - stack[top];
            }

            stack[++top] = i;

        }

        return result;
    }
}
