package chapeter05;
/*
    条件运算符:(三目运算符。）
        语法格式：
        布尔表达式？ 表达式1： 表达式2

        执行原理是什么？
            布尔表达式的结果为true时，表达式1的执行结果作为整个表达式的结果。
            布尔表达式的结果为false时，表达式2的执行结果作为整个表达式的结果。
 */
public class OperatorTest05 {
    public static void main(String[] args){
        int i = 100;

        //编译错误：不是语句
        //100;

        //错误：不是语句
        //‘男’

        boolean sex = true;

        char c = sex ?'男' :'女';
        System.out.println(c);

        System.out.println (sex ? '男':"女");
    }
}
