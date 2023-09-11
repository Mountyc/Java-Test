package Var;

//int 整数型
//char 字符型
//String 字符串型
//double 浮点型

public class Homework {
    public static void main(String[] args){
        //第一个学生信息
        //xueHao是int
        //"110"带有双引号是字符串，类型不兼容
        //int xueHao = "110";
        int xueHao = 110;
        System.out.println(xueHao);

        //int name = 张三;//编译报错
        //String (java语言规定)
        String name = "张三";
        System.out.println(name);

        //性别
        //char 字符型单引号
        char xingBie = '男';
        System.out.println(xingBie);

    }
}
