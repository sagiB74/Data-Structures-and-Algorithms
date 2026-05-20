// sagi benilush and shelley monis
package Task1;

public class StringSort {

    public String SortString(String inputString){
        char [] arr = inputString.toCharArray();
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
}
