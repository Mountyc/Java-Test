package chapeter07;
/*
方法重载机制?
1、以下程序先不使用方法重载机制，分析程序的缺点???
以下程序没有语法错误，运行也是正常的，你就分析一下代码风格存在什么缺点!
sumInt、sumLong、sumDouble不是功能"相同"，是功能"相似"。
三个方法功能不同，但是相似，分别起了三个不同的名字，有什么缺点?
缺点包括两个:
第一个:代码不美观(不好看、不整齐)。【这是次要的】
第二个:程序员需要记忆更多的方法名称，程序员比较累。
*/

public class OverloadTest01 {
    public static void main(String[] args){
        System.out.println(sumInt(10,20));
        System.out.println(sumLong(10L,20L));
        System.out.println(sumDouble(10,20));
    }
    //定义一个计算int类型数据的求和方法
    public static int sumInt(int a,int b){
        return a + b;
    }
    public static long sumLong(long a,long b){
        return a + b;
    }
    public static double sumDouble(double a,double b){
        return a + b;
    }
}
