package leetcode.Array;

/**
 * Created by yandong on 2017/4/18.
 */
public class MissingNum {
    public int missingNumber(int[] nums) {
        long total = (nums.length+1)*(nums.length)/2;
        for(int i=0;i<nums.length;i++) {
            total-= nums[i];
        }
        return (int)total;
    }
}
