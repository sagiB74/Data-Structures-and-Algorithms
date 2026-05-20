// question 1
// Shelley Monis ID: 213788433 , Sagi Benilush ID: 322566845

package EXE_3;



import java.util.Arrays;


public class Q_1 {

    public static int largestRectangleArea(int[] heights) {
        if (heights == null || heights.length == 0) return 0;

        int n = heights.length;


        int[] stack = new int[n + 1];
        int top = -1;

        long best = 0;


        for (int i = 0; i <= n; i++) {
            int cur = (i == n) ? 0 : heights[i];

            while (top >= 0 && cur < heights[stack[top]]) {
                int h = heights[stack[top--]];   // pop
                int right = i;
                int left = (top >= 0) ? stack[top] : -1;
                long width = right - left - 1;
                best = Math.max(best, width * h);
            }

            stack[++top] = i;
        }

        return (int) best;

    }

    /* ---------------------- Provided Utilities (Students can use) ---------------------- */


    static class IntStack {
        private int[] dataArr;
        private int top = -1;

        public IntStack(int capacity) {
            if (capacity < 1) capacity = 1;
            dataArr = new int[capacity];
        }

        public void push(int x) {
            if (top + 1 == dataArr.length) grow();
            dataArr[++top] = x;
        }

        public int pop() {
            if (top < 0) throw new IllegalStateException("pop from empty stack");
            return dataArr[top--];
        }

        public int peek() {
            if (top < 0) throw new IllegalStateException("peek from empty stack");
            return dataArr[top];
        }

        public boolean isEmpty() {
            return top < 0;
        }

        public int size() {
            return top + 1;
        }

        public void clear() {
            top = -1;
        }

        private void grow() {
            dataArr = Arrays.copyOf(dataArr, Math.max(2, dataArr.length * 2));
        }
    }

    /* ---------------------- Test Harness ---------------------- */

    public static void main(String[] args) {
        // Basic tests
        runTest(new int[]{2,4,5,1}, 10);
//        runTest(new int[]{2, 4}, 4);
//        runTest(new int[]{0, 0, 0}, 0);
//        runTest(new int[]{6, 2, 5, 4, 5, 1, 6}, 12);
//
//        // Edge cases
//        runTest(new int[]{}, 0);
//        runTest(new int[]{5}, 5);
//        runTest(new int[]{1, 1, 1, 1}, 4);
//        runTest(new int[]{5, 4, 3, 2, 1}, 9);   // best is 3*3 using [5,4,3] or 4*2, 5*1
//        runTest(new int[]{1, 2, 3, 4, 5}, 9);   // best is 3*3 using [3,4,5] or 4*2, 5*1
//        runTest(new int[]{1000000000, 1000000000}, 2000000000); // check potential overflow thinking

        // Feel free to add more randomized tests or large arrays for stress testing.
    }

    private static void runTest(int[] heights, int expected) {
        int actual = largestRectangleArea(heights);
        System.out.printf("heights = %s -> got: %d | expected: %d %s%n",
                Arrays.toString(heights), actual, expected, (actual == expected ? "✓" : "✗"));
    }
}













