package leetcode.Array;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/**
 * Created by yandong on 2017/4/20.
 */
public class KdiffPairsinanArray {
    public int findPairs(int[] nums, int k) {
        if(nums.length < 2){
            return 0;
        }
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n: nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue() >=2) {
                count++;
            }
            else if(map.containsKey(entry.getKey()+k)){
                count++;
            }
        }
        return count;
    }
}
