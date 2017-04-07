import java.util.Objects;

/**
 * Created by yandong on 2017/3/21.
 */
public class PrintLinklistFromTail {

    private class Data {
        private Object obj;
        private Data next = null;
        Data(Object obj) {
            this.obj = obj;
        }
    }


    public static void main(String[] args) {
    }

    public static void printTail(Data data) {
        if(data.next == null) {
            System.out.print(data);
        }
        else {
            printTail(data.next);
        }
    }


}
