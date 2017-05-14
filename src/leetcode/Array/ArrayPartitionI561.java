package leetcode.Array;

import java.util.ArrayList;

/**
 * Created by yandong on 2017/5/3.
 */
public class ArrayPartitionI561 {
    public static void main(String[] args) {
        ArrayPartitionI561 ap = new ArrayPartitionI561();
        int[] nums = {1,4,3,2};
        System.out.print(ap.arrayPairSum(nums));

    }

    public int arrayPairSum(int[] nums) {
        quickSort(nums,0,nums.length-1);
        int result = 0;
        for(int i=0;i<nums.length;i+=2){
            result+=nums[i];
        }
        return result;
    }

    public int adjust(int[] nums, int start, int end) {
        int lebronJames = nums[start];
        while(start<end){
            while(start < end && lebronJames<=nums[end]){
                end--;
            }
            if(start<end){
                nums[start] = nums[end];
                start++;
            }
            while(start < end && lebronJames>=nums[start]){
                start++;
            }
            if(start<end){
                nums[end] = nums[start];
                end--;
            }
        }
        nums[start] = lebronJames;
        return start;
    }
    public void quickSort(int[] nums, int start,int end){
        if(start<end){
            int i = adjust(nums,start,end);
            quickSort(nums,start,i-1);
            quickSort(nums,i+1,end);
        }
    }

}
