package leetcode.Array;

/**
 * Created by yandong on 2017/4/19.
 */
public class RotateArray {
    public static void main(String[] args){
        RotateArray rotateArray = new RotateArray();
        int[] arr = {1,2,3,4,5};
        rotateArray.rotate(arr,2);
        for(int i:arr){
            System.out.print(i+" ");
        }

    }
    public void rotate(int[] nums, int k) {
        if(nums.length < 1){
            return;
        }
        int step = k % nums.length;
        int[] arr = new int[step];
        for(int i=0;i<step;i++){
            arr[i] = nums[nums.length-step+i];
        }
        for(int i=nums.length-step-1;i>=0;i--){
            nums[i+step] = nums[i];
        }
        for(int i=0;i<arr.length;i++){
            nums[i] = arr[i];
        }
    }

    public void rotate2(int[] nums,int k){
        if(nums.length <1) {
            return;
        }
        int step = k % nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,step-1);
        reverse(nums,step,nums.length-1);
    }

    public int[] reverse(int[] nums,int start,int end){
        while(start<end){
            nums[start] ^= nums[end];
            nums[end] ^= nums[start];
            nums[start] ^= nums[end];
            start++;
            end--;
        }
        return nums;
    }
}
