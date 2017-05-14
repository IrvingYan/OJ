package leetcode;

import java.util.Stack;

/**
 * Created by yandong on 2017/4/10.
 */
public class ReverseWordoNe344 {
    public static void main(String[] args) {

    }

    public String reverseString(String s) {
        char[] word = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            char temp = word[i];
            word[i] = word[j];
            word[j] = temp;
            i++;
            j--;
        }
        return new String(word);
    }
}
