import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by yandong on 2017/5/5.
 */
public class FindFirst2 {
    public static void main(String[] args){
        int[] nums = {1,5,3,4,4,2};
        System.out.print(got2(nums));
    }

    public static int got2(int[] nums){
        if(nums.length < 1){
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for(int n:nums){
            if(!set.add(n)) return n;
            else set.add(n);
        }
        return 0;
    }
}
