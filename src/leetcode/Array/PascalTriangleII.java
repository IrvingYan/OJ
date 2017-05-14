package leetcode.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yandong on 2017/4/18.
 */
public class PascalTriangleII {
    public static void main(String[] args) {
        List<Integer> list =  getRow2(3 );
        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }
    }

    public static List<Integer> getRow2(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for(int i=1;i<=rowIndex;i++) {
            for(int j=i-1;j>=1;j--) {
                Integer buff = list.get(j-1)+list.get(j);
                list.set(j,buff);
            }
            list.add(1);
        }
        return list;
    }
}
