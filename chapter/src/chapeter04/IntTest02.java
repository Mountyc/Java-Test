package chapeter04;
/*
    1.小容量可以直接赋值给大容量，称为自动类型转换。
    2.大容量不能直接赋值给小容量，需要使用强制类型转换
    (虽然编译通过，但是运行的时候可能会损失精度）
 */

public class IntTest02 {
    public static void main(String[] args){
        long x = 100l;

        int y = (int)100;//强制转换符
        System.out.println(y);

        int a = 100;
        System.out.println(a);

        int b = a;
        System.out.println(b);

    }
}
