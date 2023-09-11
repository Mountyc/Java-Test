package Array;

public class ArrayTest04 {
    public static void main(String[] args) {
        //静态初始化一维数组
        int[] a1 = {1,2,3};
        printArray(a1);

        System.out.println("====================");
        //没有这种语法
        //printArray({1,2,3});
        //如果直接传递一个静态数组的话，语法必须这样写
        printArray(new int[]{1,2,3});

        //动态初始化一维数组
        int[] a2 = new int[4];
        printArray(a2);

        System.out.println("==========================");
        printArray(new int[3]);
    }
    public static void printArray(int[] array){
        for(int i = 0;i < array.length;i++){
            System.out.println(array[i]);
        }
    }
}
