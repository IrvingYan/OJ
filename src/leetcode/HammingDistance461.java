package leetcode;

/**
 * Created by yandong on 2017/4/8.
 * 求汉明距离
 */
public class HammingDistance461 {
    public static void main(String[] args) {
        HammingDistance461 ham = new HammingDistance461();
        int count = ham.hammingDistance(2,4);
        System.out.print("hamming distance is: "+ count);
    }

    public int hammingDistance(int x,int y) {
        int count = 0;
        int xor = x ^ y;
        while(xor !=0 ) {
            count += xor & 1;
            xor = xor >> 1;
        }
        return count;
    }

}
