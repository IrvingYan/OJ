package leetcode.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yandong on 2017/4/19.
 */
public class PascalsTriangle {
    public static void main(String[] args) {
        PascalsTriangle pascalsTriangle = new PascalsTriangle();
        List<List<Integer>> list = pascalsTriangle.generate(5);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).toString());
        }
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> listWithList = new ArrayList<>();

        if(numRows<1){
            return listWithList;
        }
        for(int i=0;i<numRows;i++){
            List<Integer> list=  new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j ==0 || j == i){
                    list.add(1);
                }
                else{
                    list.add(listWithList.get(i-1).get(j-1)+listWithList.get(i-1).get(j));
                }
            }
            listWithList.add(list);
        }
        return listWithList;
    }
}
