import java.util.Arrays;

public class Main {
    static void main(String[] args) {
//        int[] arr =  {1,3,12,13,17};
//        System.out.println(FindPair(90,arr));
//        System.out.println(FlipNum(1000000001));
//        System.out.println(SortString("ZzaACZzaAC"));
//        System.out.println(SortString("GHjkre"));
        int  [] arr = {3,1,6,2,9,8};
        InsertSort(arr);
        System.out.println(Arrays.toString(arr));






    }

    public static boolean FindPairHelper(int x,int[] arr, int start,int end){

        if (x == arr[start] + arr[end]){
            return true;
        }
        if (start >= end){
            return false;
        }
        int sum = arr[start] + arr[end];
        if (sum > x){
            return FindPairHelper(x, arr,start, end-1);
        }
        else {
            return FindPairHelper(x,arr,start+1,end);
        }
    }
    public static boolean FindPair(int x, int [] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if (x == arr[i] + arr[j]){
//                    return true;
//                }
//            }
//        }return false;

//        int start = 0;
//        int end = arr.length -1;
//
//        while (start < end){
//            if (arr[start] + arr[end] ==  x){
//                return true;
//
//            } else if (arr[start] + arr[end] >  x) {
//                end -=1;
//
//            } else if (arr[start] + arr[end] <  x) {
//                start += 1;
//
//            }
//
//        }return false;
        return FindPairHelper(x,arr,0, arr.length-1);


    }

    private static int FlipNumHelper(int num, int res){

        if (num == 0){
            return res;
        }
        res = res * 10 +  (num % 10);
        return FlipNumHelper(num/10, res);

    }

    private static int FlipNum(int num){
        return FlipNumHelper(num,0);
    }


    private static String SortString(String s){
        char [] arr = s.toCharArray();
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                int first = (int) arr[j];
                int second = (int) arr[j+1];
                if (first < 97){ first += 32;}
                if (second < 97) {second += 32;}

                if (first > second){
                    char temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;

                }

            }

        }return new String(arr);

    }

    public static void ArrSort(int [] arr){
        boolean flag = true;
        while (flag){
            flag = false;
            for (int i = 0; i < arr.length -1; i++) {
                if (arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    flag = true;
                }

            }
        }
    }


    public static void InsertSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i -1;
            while (j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j -1;
            }
            arr[j + 1] = key;

        }
    }
}