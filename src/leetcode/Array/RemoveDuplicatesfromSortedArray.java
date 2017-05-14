package leetcode.Array;

/**
 * Created by yandong on 2017/4/18.
 */
public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {

    }

    public int removeDuplicates(int[] nums) {
        if(nums.length < 1){
            return 0;
        }
        int count =1;
        for(int i = 1;i<nums.length;i++) {
            if(nums[i] == nums[i-1]){
                continue;
            }
            else{
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
