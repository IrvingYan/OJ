package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yandong on 2017/4/10.
 */
public class FizzBuzz412 {
    public static void main(String[] args) {
        FizzBuzz412 fb = new FizzBuzz412();
        List<String> list = fb.fizzBuzz(15);
        for(String s: list) {
            System.out.println(s);
        }
    }

    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for(int i=1;i<=n;i++) {
            if(i % 3 == 0) {
                if(i % 5 == 0) {
                    list.add("FizzBuzz");
                }
                else{
                    list.add("Fizz");
                }
            }
            else if (i % 5 == 0) {
                list.add("Buzz");
            }
            else{
                list.add(String.valueOf(i));
            }
        }
        return list;
    }
}
