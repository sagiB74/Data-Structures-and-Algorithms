package TestPractice;

public class NearestSmall {
    public int[] NearestSmallCalc(int [] lst){
        Stack s1 = new Stack(lst.length);
        int[] result = new int[lst.length];

        for (int i = 0; i < lst.length; i++) {
            if (s1.getSize() == 0){
                result[i] = -1;
                s1.push(lst[i]);
                continue;

            }

            while (s1.getSize() != 0) {

                if (lst[i] > s1.Peek()) {
                    result[i] = s1.Peek();
                    s1.push(lst[i]);
                    break;
                } else {
                    s1.pop();
                }
            }
            if (s1.getSize() == 0) {
                result[i] = -1;
                s1.push(lst[i]);
            }




        }

        return result;
    }
}
