package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static java.lang.System.in;

/**
 * Created by yandong on 2017/4/9.
 */
public class ReverseWords {
    public static void main(String[] args) {
        ReverseWords rw = new ReverseWords();
        System.out.print(rw.reverseWords("hello word"));
    }

    public String reverseWords(String s) {
       String[] words = s.split(" ");
       String res = "";
       for( String word: words) {
            res += reverse(word)+ " ";
        }
        return res;
    }

    public String reverse(String word) {
        String str = "";
        for(int i=0; i<word.length(); i++) {
            str = word.charAt(i) + str;
        }
        return str;
    }



}
