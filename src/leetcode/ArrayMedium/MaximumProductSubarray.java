package leetcode.ArrayMedium;

/**
 * Created by yandong on 2017/5/9.
 */
public class MaximumProductSubarray {

    public static void main(String[] args){
        int[] nums = {2,3,-2,4};
        System.out.print(maxProduct(nums));
    }
    public static int maxProduct(int[] nums) {
        if(nums == null || nums.length<1){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        int min_local = nums[0];
        int max_local = nums[0];
        int global = nums[0];
        for(int i=1;i<nums.length;i++){
            int copy_local = max_local;
            max_local = Math.max(Math.max(max_local*nums[i],nums[i]),min_local*nums[i]);
            min_local = Math.min(Math.min(copy_local*nums[i],nums[i]),min_local*nums[i]);
            global = Math.max(max_local,global);
        }
        return global;
    }
}
