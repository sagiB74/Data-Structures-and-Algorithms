package Task1;

public class Main {
    static void main(String[] args) {
        StringSort s = new StringSort();
        System.out.println(s.SortString("zZaAC"));

        SortMatrix sorter = new SortMatrix();
        int [][] matrix1 = { {9,3,6,5},{2,4,8,2},{7,2,2,1}, {9,8,3,6} };

        sorter.SortDiagonal(matrix1);

        Palindrome number = new Palindrome();
        System.out.println(number.isPalindrome(123321));
        System.out.println(number.isPalindrome(111));
        System.out.println(number.isPalindrome(1121));




    }
}
