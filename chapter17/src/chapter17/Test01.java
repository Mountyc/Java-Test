package chapter17;

public class Test01 {
    public static void main(String[] args) {
        //创建Hello World对象
        //HelloWorld 的完整类名：chapter17.HelloWorld
        chapter17.HelloWorld hw = new HelloWorld();
        System.out.println(hw);//chapter17.HelloWorld@27d6c5e0

        //包名可以省略
        //因为helloWorld和test01在同一个package下
        HelloWorld hw2 = new HelloWorld();
        System.out.println(hw2);//chapter17.HelloWorld@4f3f5b24
    }
}
