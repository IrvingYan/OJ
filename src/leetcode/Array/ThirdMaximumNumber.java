package leetcode.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yandong on 2017/4/20.
 */
public class ThirdMaximumNumber {
    public static void main(String[] args){
        ThirdMaximumNumber obj = new ThirdMaximumNumber();
        int[] nums = {1,2,2,3};
        System.out.print(obj.thirdMax(nums));
    }
    public int thirdMax(int[] nums) {
        Integer max = null;
        Integer secondMax = null;
        Integer thirdMax = null;
        for(Integer n: nums){
            if(n.equals(max) || n.equals(secondMax) || n.equals(thirdMax)) continue;
            if(max==null || n>max){
                thirdMax = secondMax;
                secondMax = max;
                max = n;
            }
            else if( secondMax == null || n>secondMax ){
                thirdMax = secondMax;
                secondMax = n;
            }
            else if(thirdMax == null || n>thirdMax){
                thirdMax = n;
            }
        }
        return thirdMax == null ? max : thirdMax;
    }
}
