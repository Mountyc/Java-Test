package Var;

/*
变量的第一个测试程序：Var是变量
    1.关于程序当中的数据？
     开发软件是为了解决现实生活中的问题
     而现实世界当中，有很多问题都是使用数据进行描述的。
     所以软件执行过程中最主要就是对数据的处理。
     Java中的概念“字面量”。

     字面量可以分为很多种类：
        整数型字面量:1 2 3 4 100 -100
        浮点型字面量:1.1 1.4 3.14
        布尔型字面量:true false 无其他值

        字符型字面量：'a‘ ’b'
        字符串型字面量："abc" "a" "中"

        其中字符型和字符串型都是描述现实世界中的文字：
        需要注意的是：
            所有的字符型只能使用单引号括起来。
            所有的字符串型只能使用双引号括起来。

          字符型一定是单个字符才能成为“字符型”
          单引号一定是字符型，双引号一定是字符串

 */
public class VarTest01 {
    public static void main (String [] args){
        System.out.println(100);
        System.out.println(3.14);
        System.out.println(true);
        System.out.println(false);
        System.out.println('a');
        System.out.println('中');
        System.out.println("abc");
    }

}