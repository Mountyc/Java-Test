package Var;
/*
    变量
    就是内存当中存储数据的最基本单元。
    三要素 （类型+名字+值）
    变量必须先声明在赋值
    可以变的量
    在同一个域当中变量名不能重复

    数据类型
    记住：不同数据类型，在内存中分配的空间大小不同。
    1个字节= 1比特位（bit）

    变量声明（数据类型 变量名;) int niaLing;



 */

public class VarTest02 {
    /*
    这是一个程序的入口
    @param args是main方法的参数
     */
    public static void main(String[] args){
        int age;
        age = 45;
        System.out.println(age);//访问变量
        System.out.println("age");//访问字符串
        age = 80;//重新赋值
        System.out.println(age);

        // 注意:方法体当中代码遵循自上而下的顺序依次逐行运行。
        int tiZhong = 80;//体重
        System.out.println(tiZhong);
    }

}
