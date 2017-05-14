package leetcode.Array;

/**
 * Created by yandong on 2017/4/18.
 */
public class MaxConcecutiveOnes {
    public static void main(String[] args) {
        MaxConcecutiveOnes mco = new MaxConcecutiveOnes();
        int[] arr = {1,0,1,1,0,1};
        System.out.print(mco.findMaxConsecutiveOnes(arr));
    }
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int len=0;
        for(int n:nums) {
            if(n ==1 ){
                len++;
                max = Math.max(max,len);
            }else{
                len = 0;
            }
        }
        return max;
    }
}
