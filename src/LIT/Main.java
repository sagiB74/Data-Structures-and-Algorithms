package LIT;

public class Main {
    static void main(String[] args) {
        int [] numbers = {10000,1,10000,1,1,1,1,1,1};

        EX_1 res = new EX_1();
        int result;
        result = res.maximumUniqueSubarray(numbers);
        System.out.println(result);


    }
}
