package leetcode.Array;

/**
 * Created by yandong on 2017/4/18.
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if(nums.length<1){
            return 0;
        }
        int index = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] !=val){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
