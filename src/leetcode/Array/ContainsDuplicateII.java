package leetcode.Array;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by yandong on 2017/4/13.
 *
 * Given an array of integers and an integer k, find out whether there are two distinct indices i and j in
 * the array such that nums[i] = nums[j] and the difference between i and j is at most k.
 *
 * 给出一个整数数组，判断该数组内是否有两个元素值是相同的，且他们的索引值相差不大于k，是则返回true，否则返回false
 */
public class ContainsDuplicateII {
    public static void main(String[] args) {

    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        if(nums.length <=1) {
            return false;
        }
        for(int i=0;i<nums.length;i++) {
            if(map.containsKey(nums[i]) && i-map.get(nums[i])<= k) {
                return true;
            }
            map.put(nums[i],i);
        }
        return false;
    }

    public boolean containsNearbyDuplicateBySet(int[] nums, int k) {
        if(nums.length <= 1) {
            return false;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++) {
            if(i > k) set.remove(nums[i-k-1]);
            if(! set.add(nums[i])) return true;
        }

        return false;
    }


}
