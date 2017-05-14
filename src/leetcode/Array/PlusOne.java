package leetcode.Array;

/**
 * Created by yandong on 2017/4/18.
 */
public class PlusOne {
    public static void main(String[] args) {

    }

    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>0;i--){
            if(digits[i] < 9) {
                digits[i]--;
                return digits;
            }

            digits[i] = 0;
        }

        int[] newDigits = new int[digits.length+1];
        newDigits[0] = 1;
        return newDigits;
    }
}
