package leetcode.Array;

/**
 * Created by yandong on 2017/4/19.
 */
public class TwoSumIIInputarrayissorted {
    public int[] twoSum(int[] numbers, int target) {
        int[] arr = new int[2];
        if(numbers.length < 2) {
            return arr;
        }
        int low = 0;
        int high = numbers.length-1;
        while(low<high){
            if(numbers[low]+numbers[high] == target){
                arr[0] = low+1;
                arr[1] = high+1;
                return arr;
            }
            else if(numbers[low]+numbers[high]< target){
                low++;
            }
            else{
                high--;
            }
        }
        return arr;
    }
}
