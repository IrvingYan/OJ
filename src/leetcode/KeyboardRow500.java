package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yandong on 2017/4/9.
 */
public class KeyboardRow500 {
    public static void main(String[] args) {
        KeyboardRow500 kb = new KeyboardRow500();
        String[] strs = {"qwer","wert","qsd"};
        for(String s: kb.findWords(strs)) {
            System.out.println(s);
        }
    }

    public String[] findWords(String[] words) {
        String[] keyboard = {"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"};
        List<String> list = new ArrayList<>();
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i <keyboard.length;i ++) {
            for(char c: keyboard[i].toCharArray()) {
                map.put(c,i);
            }
        }

        for(String word: words) {
            int index = map.get(word.toUpperCase().charAt(0));
            for(char c: word.toUpperCase().toCharArray()) {
                if(map.get(c) != index) {
                    index = -1;
                    break;
                }
            }
            if(index != -1) {
                list.add(word);
            }
        }
        return list.toArray(new String[0]);
    }
}
