package leetcode.ArrayMedium;

import java.util.List;

/**
 * Created by yandong on 2017/5/11.
 */
public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle == null || triangle.size()<1){
            return 0;
        }

        List<Integer> minimum = triangle.get(triangle.size()-1);
        for(int i=triangle.size()-2;i>=0;i--){
            for(int j=0;j<=i;j++){
                minimum.set(j,Math.min(minimum.get(j),minimum.get(j+1))+triangle.get(i).get(j));
            }
        }
        return minimum.get(0);
    }
}
