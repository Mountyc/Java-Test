package Array;

public class ArrayTest03 {
    //main方法的编写格式，还可以采用C++的语法格式哦
    public static void main(String[] args) {
        System.out.println("Hello,World");

        //java风格
        int[] a1 = {1,23,3};
        for(int i = 0;i < a1.length ; i++){
            System.out.println(a1[i]);
        }
        //C++的写法，不建议
        int[] a2 = {3,4,2};
        for(int i = 0;i < a2.length ; i++){
            System.out.println(a2[i]);
        }
        //调用方法时传一个数组
        int[] x= {1,2,3};
        printArray(x);

        //创建String数组
        String[] strs = {"abc","def","HeHe","haha"};
        printArray(strs);

        String[] stringArray = new String[10];
        printArray(stringArray);//10个null

        System.out.println("===========================");
        printArray(new String[3]);
        System.out.println("*****************************");
        printArray(new int[4]);
    }
    public static void printArray(int[] array){
        for(int i = 0;i < array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static void printArray(String[] array){
        for(int i = 0;i < array.length;i++){
            System.out.println("String数组中的元素" + array[i]);
        }
    }

}
