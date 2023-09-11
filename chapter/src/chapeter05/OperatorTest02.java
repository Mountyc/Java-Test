package chapeter05;
/*
    关系运算符：
        >
        >=
        <
        <=
        ==
        !=
    一定要记住一个规则：
    所有的运算符的结果都是布尔类型
    不是true就是false，不可能是其他类型。

    在Java语言中：
        = ：赋值运算符
        == :关系运算符，判断是否相等。

        注意关系运算符中如果有两个符号的话，两个符号之间不能有空格。

 */

public class OperatorTest02 {
    public static void main (String[] args){
        int a = 10;
        int b = 10;
        System.out.println(a > b);//false
        System.out.println(a >= b);//ture
        System.out.println(a < b);//false
        System.out.println(a <= b);//true
        System.out.println(a == b);//true
        System.out.println(a != b);//false
    }
}
