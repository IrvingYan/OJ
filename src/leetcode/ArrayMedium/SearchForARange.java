package leetcode.ArrayMedium;

/**
 * Created by yandong on 2017/4/25.
 */
public class SearchForARange {
    public static void main(String[] args){
        SearchForARange object = new SearchForARange();
        int[] nums = {5,7,7,8,8,10};
        int[] result = object.searchRange(nums,8);
        for(int num: result){
            System.out.println(num);
        }

    }
    public int[] searchRange(int[] nums, int target) {
        int[] array = new int[2];
        if(nums == null || nums.length<1){
            return array;
        }
        int n = nums.length;
        int i=0,j=n-1;

        while(i<j){
            int mid = (i+j)/2;
            if(nums[mid]<target) i = mid+1;
            else j = mid;
        }
        if(nums[i] != target) return array;
        else{
            array[0] = i;
        }

        j = n-1;
        while(i<j){
            int mid = (i+j)/2+1;
            if(nums[mid]>target) j = mid-1;
            else i = mid;
        }
        if(nums[i] != target) return array;
        else{
            array[1] = i;
        }
        return array;
    }
}
