package leetcode;

/**
 * Created by yandong on 2017/4/9.
 */
public class NumberComplement476 {
    public static void main(String[] args) {
        NumberComplement476 num = new NumberComplement476();
        System.out.println(num.findComplement(5));
    }

    public int findComplement(int num) {
        boolean flag = false;
        for(int i=31;i>0;--i) {
            if((num & (1 << i)) == 1) {
                flag = true;
            }
            if(flag) {
                num ^= (1 << i);
            }
        }
        return num;
    }

}
