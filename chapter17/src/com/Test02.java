package com;

//将需要的类导入
import chapter17.HelloWorld;

public class Test02 {
    public static void main(String[] args) {
        /*
            Test02在com包下。
            HelloWorld在chapter17下。
            不在同一个package下，包不能省略
         */
        //错误找不到符号
        /*
        HelloWorld hw = new HelloWorld();
        System.out.println(hw);
         */
        /*
        chapter17.HelloWorld hw = new HelloWorld();
        System.out.println(hw);
         */
        HelloWorld hw1 = new HelloWorld();
        System.out.println(hw1);
    }
}
