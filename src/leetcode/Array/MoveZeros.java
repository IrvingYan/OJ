package leetcode.Array;

/**
 * Created by yandong on 2017/4/20.
 */
public class MoveZeros {
    public static void main(String[] args){
        MoveZeros obj = new MoveZeros();
        int[] nums = {0,1,0,3,12};
        obj.moveZeroes(nums);
        for(int i:nums){
            System.out.println(i);
        }
    }
    public void moveZeroes(int[] nums) {

        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
    }

}
