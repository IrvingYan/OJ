import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

/**
 * Created by yandong on 2017/3/28.
 */
public class Sort {
    public static void main(String[] args) {
        int[] arr = { 6, 5, 3, 1, 8, 7, 2, 4 };
        Sort sort = new Sort();
        System.out.println("bubbleSort :");
        printArray(sort.cockTail(arr));
    }

    public static void printArray(int[] arr) {
        for (int i :
                arr) {
            System.out.println(i);
        }
    }

//--------插入排序-------------------------------------------------------------

    // 分类 ------------- 内部比较排序
    // 数据结构 ---------- 数组
    // 最差时间复杂度 ---- 最坏情况为输入序列是降序排列的,此时时间复杂度O(n^2)
    // 最优时间复杂度 ---- 最好情况为输入序列是升序排列的,此时时间复杂度O(n)
    // 平均时间复杂度 ---- O(n^2)
    // 所需辅助空间 ------ O(1)
    // 稳定性 ------------ 稳定
    public static int[] InsertSort(int[] arr) {
        int size = arr.length;
        int i,j,get;
        for(i=1; i<size; i++) {
            get = arr[i];
            j = i-1;
            while(j >= 0 && arr[j] > get) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = get;
        }
        return arr;
    }

    //--------冒泡排序-------------------------------------------------------------

    // 分类 -------------- 内部比较排序
    // 数据结构 ---------- 数组
    // 最差时间复杂度 ---- O(n^2)
    // 最优时间复杂度 ---- 如果能在内部循环第一次运行时,使用一个旗标来表示有无需要交换的可能,可以把最优时间复杂度降低到O(n)
    // 平均时间复杂度 ---- O(n^2)
    // 所需辅助空间 ------ O(1)
    // 稳定性 ------------ 稳定
    public int[] bubbleSort(int[] arr) {
        int biu=0;
        for(int j= arr.length-1; j > 0 ; j--) {
            for(int i=0;i < j; i++) {
                if(arr[i] > arr[i+1]) {
                    biu = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = biu;
                }
            }
        }
        return arr;
    }

    //--------定向冒泡排序-鸡尾酒排序-------------------------------------------------------------
    public int[] cockTail(int[] arr) {
        int biu = 0;
        int left = 0;
        int right = arr.length-1;
        while (left < right) {
            for(int i=0; i<right; i++) {
                if(arr[i]>arr[i+1]){
                    biu = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = biu;
                }
            }
            right--;
            for(int i= right; i>left; i--) {
                if(arr[i-1] > arr[i]){
                    biu = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = biu;
                }
            }
            left++;
        }
        return arr;
    }

}
