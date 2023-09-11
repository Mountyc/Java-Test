package chapeter04;
/*
    整数型在java中共四种类型
    byte  1个字节  max127
    short 2个字节  max32767
    int   4个字节  2147483647，超出可用long类型
    long  8个字节

    1个字节 = 8个二进制
    1byte = 8bit
     int最常用开发时不用斤斤计较，直接用int
     结论：在任何情况下，整数型“字面量/数据”默认被当int数据处理
 */
public class IntTest01 {
    public static void main (String[] args){

        int a = 100;
        System.out.println(a);

        //存在类型转换
        long b = 200;
        System.out.println(b);

        //不存在类型转换
        long c = 300L;
        System.out.println(c);

    }
}
