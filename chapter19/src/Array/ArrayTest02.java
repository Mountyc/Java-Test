package Array;
/*
    关于每个类型的默认值还有印象吗？
        数据类型            默认值
        ----------------------------
        byte                0
        short               0
        int                 0
        long                0L
        float               0.0F
        double              0.0
        boolean             false
        char                \u0000
        引用数据类型          null

        什么时候采用静态初始化方式，什么时候使用动态初始化方式？
            当你创建数组的时候，确定数组中存储哪些具体元素时，采用静态初始化方式
            当你创建数组的时候，不确定将来数组中存储哪些数据，可以采用动态初始化的方式，预先分配内存空间。

 */
public class ArrayTest02 {
    public static void main(String[] args) {
        //声明、定义一个数组，采用动态初始化的方式创建
        int[] a = new int[4];//创建长度为4的int数组，数组中每个元素的默认值是0
        //遍历数组
        for(int i = 0; i< a.length; i++){
            System.out.println("数组中下标为" +i+"的元素为" +a[i]);
        }

        //初始化一个Object类型的数组，采用动态初始化方式
        Object[] objs = new Object[3];//创建长度为3的Object数组，数组中每个元素的默认值是null
        for (int i = 0;i< objs.length;i++){
            System.out.println(objs[i]);
        }
        System.out.println("===============================");

        String[] strs = new String[3];
        for (int i = 0;i< strs.length;i++){
            System.out.println(strs[i]);
        }

        //采用静态初始化的方式
        String[] strs2 = {"abc","def","xyz"};
        for(int i = 0;i< strs2.length;i++){
            System.out.println(strs[i]);
        }
        //存储Object，采用静态初始化
        /*
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = new Object();

        Object[] objects = {o1,o2,o3};
         */
        Object[] objects = {new Object(),new Object(),new Object()};

        for(int i = 0;i < objs.length;i++ ){
            /*
            Object o = object[i];
            System.out.println(o);
             */
            System.out.println(objects[i]);
        }
    }
}
