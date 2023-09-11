package chapeter05;
/*
    赋值运算符：
     1.赋值运算符包括“基本赋值运算符”和扩展赋值运算符“：基本的、扩展的。
     2.扩展的赋值运算符？
        =
     3.扩展的赋值运算符号？
        +=
        -=
        *=
        /=
        %=
        注意：扩展赋值运算符在编写的时候，两个符号之间不能有空格。
     4.很重要的语法机制：
        使用扩展赋值运算符的时候永远都不会改变运算结果类型。
        byte x = 100；
        x += 1；
j
 */
public class OperatorTest04 {
    public static void main (String[] args){
        int i = 10;
        i = 20;
        byte b = 10;
        b = 20;

        /*
        以 +=运算符作为代表，学习扩展赋值运算符。
         */
        int k = 10;
        k += 20;//k变量追加20
        System.out.println(k);//30

        int  m = 10;
        //+=运算符类似于下面表达式
        m = m + 20;
        System.out.println(m);//30
    }
}
