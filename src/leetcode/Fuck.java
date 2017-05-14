package leetcode;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by yandong on 2017/5/13.
 */
public class Fuck {
    public static void main(String[] args){
        int[] nums = {1,2,1,2,3,3,2};
        System.out.print(find(nums));
    }

    public static int find(int[] nums){
        if(nums.length < 1 || nums == null){
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!set.add(nums[i])){
                set.remove(nums[i]);
            }
            else{
                set.add(nums[i]);
            }
        }
        return (int)set.toArray()[0];
    }
}
