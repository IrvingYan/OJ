package leetcode.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yandong on 2017/4/19.
 */
public class FindAllNumbersDisappearedinanArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        if(nums.length < 2){
            return list;
        }
        int n = nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[Math.abs(nums[i])-1] > 0){
                nums[Math.abs(nums[i])-1] = -nums[Math.abs(nums[i])-1];
            }
        }
        for(int i=1;i<=nums.length;i++){
            if(nums[i-1]>0){
                list.add(i);
            }
        }
        return list;
    }
}
