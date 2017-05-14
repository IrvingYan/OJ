package leetcode.Array;

/**
 * Created by yandong on 2017/5/3.
 */
public class SubarraySumEqualsK {
    public static void main(String[] args){
        SubarraySumEqualsK s = new SubarraySumEqualsK();
        int[] nums = {3,2,3,2,3};
        int n = s.subarraySum(nums,5);
        System.out.print(n);

    }

    public int subarraySum(int[] nums, int k) {
        if(nums.length < 1){
            return 0;
        }
        int sum = 0,count=0;
        for(int i=0;i<nums.length;i++){
            sum+= nums[i];
            if(sum == k){
                count++;
                sum=nums[i];
            }
            else if(sum > k){
                if(nums[i] == k){
                    count++;
                    sum=0;
                }
                else{
                    sum = nums[i];
                }
            }
        }
        return count;
    }
}
