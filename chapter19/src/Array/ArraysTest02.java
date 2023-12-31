package Array;

import java.util.Arrays;

/**
 * 好消息
 * sun公司已经为我们程序员写好了一个数组工具类
 * Java.util.Arrays;
 */
public class ArraysTest02 {
    public static void main(String[] args) {
        //java.util.Arrays;工具类中有哪些方法，我们开发时候要参考API帮助文档
        //不要死记硬背。
        int[] arr = {3, 4, 45, 1, 2, 32, 5, 5};
        //排序
        Arrays.sort(arr);
        //输出
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //二分查找（建立在排序基础之上）
        int index = Arrays.binarySearch(arr,5);
        System.out.println(index == -1 ? "该元素不存在" : "该元素下标为" + index);
    }
}
