package Array;

public class BubbleSort {
    public static void main(String[] args) {

        //这是int类型的数组对象
        //int[] arr = {3, 2, 7, 6, 8};
        int[] arr = {9, 8, 10, 7, 6, 0, 11};

        //经过冒泡排序算法对以上数组中元素进行排序
        //冒泡排序算法的核心是什么？

        //七条数据循环六次。以下代码可以循环六次
        /*
        for(int i = 0; i < arr.length-1; i--){
            System.out.println(i);
        }
         */
        //七条数据循环六次。以下代码可以循环六次.(冒泡排序的外层循环采用这种方式)
        //int count = 0;
        for (int i = arr.length -1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                //不管是否需要交换位置，总之是要比较一次的
                //count++;
                if(arr[j] > arr[j+1]) {
                    //交换位置
                    //arr[j]和arr[j+1] 交换
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        //System.out.println("比较次数: " + count);
        //输出结果
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
