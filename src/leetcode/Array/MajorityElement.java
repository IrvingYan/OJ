package leetcode.Array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by yandong on 2017/4/19.
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue() > nums.length/2){
                return entry.getKey();
            }
        }
        return 0;
    }

    public int majorityElement2(int[] nums){
        int major = nums[0];
        int count = 1;
        for(int i=1;i<nums.length;i++){
            if(count == 0){
                count++;
                major = nums[i];
            }
            else if(nums[i] == major){
                count++;
            }
            else{
                count--;
            }
        }
        return major;
    }

}
