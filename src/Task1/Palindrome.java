// sagi benilush and shelley monis
package Task1;

public class Palindrome {

    public boolean isPalindrome(int x){
        return x == mirroredNum(x);
    }

    public int mirroredNum(int num) {
        return mirroredNumHelper(num,0);
    }

    public int mirroredNumHelper(int num, int res) {
        if (num == 0){
            return res;
        }
        int digit = num%10;
        res = res*10 + digit;
        return mirroredNumHelper(num/10,res);
    }
}
