package leetcode.ArrayMedium;

/**
 * Created by yandong on 2017/5/11.
 */
public class TeemoAttacking {
    public static void main(String[] args){
        int[] nums = {1,4,5,6};
        int duration = 2;
        System.out.print(findPoisonedDuration(nums,duration));
    }
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries == null || timeSeries.length<1) return 0;
        int sum = 0;
        for(int i=1;i<timeSeries.length;i++){
            if(timeSeries[i] - timeSeries[i-1] >= duration){
                sum+=duration;
            }
            else {
                sum+= timeSeries[i]-timeSeries[i-1];
            }
        }
        sum+= duration;
        return sum;
    }
}
