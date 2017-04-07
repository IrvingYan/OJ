/**
 * Created by yandong on 2017/3/21.
 */
public class ReplaceSpace {
    public static void main(String[] args) {

    }

    public static String replaceByStringBuilder(String str) {//时间复杂度
        char[] arr = str.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (char a: arr) {
            if(a == ' '){
                builder.append("%20");
            }
            else {
                builder.append(a);
            }
        }
        return builder.toString();
    }

    public static String replaceSpace(String str) {
        int spaceNum = getSpaceNum(str);
        char[] a = str.toCharArray();

        return "";
    }
    
    public static int getSpaceNum(String str) {
        int num = 0;
        for (char a : str.toCharArray()) {
            if(a == ' '){
                num++;
            }
        }
        return num;
    }
}
