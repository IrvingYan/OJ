package leetcode.ArrayMedium;

import leetcode.Array.MajorityElement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by yandong on 2017/4/25.
 */
public class MajorityElementII {
    public static void main(String[] args){
        MajorityElementII majorityElementII = new MajorityElementII();
        int[] arr = {3,2,3};
        List<Integer> list = majorityElementII.majorityElement(arr);
        for(Integer n : list){
            System.out.println(n);
        }
    }

    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list= new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        if(nums.length<1){
            return list;
        }
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
            if(map.getOrDefault(nums[i],0)>(n/3)){
                list.add(nums[i]);
                map.put(nums[i],-n);
            }
        }
        return list;
    }
}
