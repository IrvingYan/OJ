package leetcode.Array;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yandong on 2017/4/20.
 */
public class TwoNum {
    public static void main(String[] args){
        TwoNum tn = new TwoNum();
        int[] arr = {3,2,4};
        int[] result = tn.twoSum(arr,6);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] arr = new int[2];
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target - nums[i])){
                arr[1] = i;

                arr[0] = map.get(target-nums[i]);
                return arr;
            }
            map.put(nums[i],i);
        }
        return arr;
    }

    public int[] twoSum1(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i);
        }
        return result;
    }
}
