package leetcode.ArrayMedium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yandong on 2017/4/25.
 */
public class SummaryRanges {
    public static void main(String[] args){
        SummaryRanges sr = new SummaryRanges();
        int[] nums = {0,1,2,4,5,7};
        List<String> list = sr.summaryRanges(nums);
        for(String s : list){
            System.out.println(s);
        }
    }
    public List<String> summaryRanges(int[] nums) {
        int start = 0;
        int end = 0;
        List<String> list = new ArrayList<>();

        if(nums.length<1 || nums == null){
            return list;
        }

        while(end < nums.length){
            while(end+1<nums.length && nums[end+1] == nums[end]+1){
                end++;
            }
            if(start != end){
                list.add(nums[start] + "->" + nums[end]);
            }else {
                list.add(String.valueOf(nums[start]));
            }
            start = end = end+1;
        }
        return list;
    }
}
