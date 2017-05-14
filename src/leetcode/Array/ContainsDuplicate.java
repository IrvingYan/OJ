package leetcode.Array;

import java.util.*;

/**
 * Created by yandong on 2017/4/18.
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length < 2){
            return false;
        }
        Set<Integer> set = new HashSet<>();
        for(int i: nums){
            if(!set.add(i)){
                return true;
            }
        }
        return false;
    }
}
