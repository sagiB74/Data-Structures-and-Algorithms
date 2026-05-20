package TestPractice;

public class NearestSmallerLeft {

    public int[] nearestSmallerToLeft(int[] arr) {
        Stack s1 = new Stack(arr.length);
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {

            if (s1.getSize() == 0) {
                result[i] = -1;
                s1.push(arr[i]);
                continue;
            }
            while (s1.getSize() != 0) {
                if (arr[i] > s1.Peek()) {
                    result[i] = s1.Peek();
                    s1.push(arr[i]);
                    break;
                } else {
                    s1.pop();

                }
            }
            if (s1.getSize() == 0){
                result[i] = -1;
                s1.push(arr[i]);
            }

        }
        return result;
    }
}
