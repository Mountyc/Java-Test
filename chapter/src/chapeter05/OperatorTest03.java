package chapeter05;
/*
    逻辑运算符：
    & 逻辑与（可以翻译成并且）
    | 逻辑或（可以翻译成或者）
    ！ 逻辑非（取反）
    && 短路与
    || 短路或

 */
public class OperatorTest03 {
    public static void main (String[] args){
        System.out.println(true & true);
        System.out.println(true &false);
        System.out.println(false & false);

        System.out.println(100 > 90 & 100 > 90);
        int a = 100;
        int b = 101;
        int c = 90;
        System.out.println(a < b & a > c);//true

        System.out.println(a < b | c > b);//true
        System.out.println(true | false);//true

        System.out.println(true | true);//true
        System.out.println(false | false);//false

        System.out.println(!false);//true
        System.out.println(!true);//false

        System.out.println(!(a > b));//true
        /*
            关于短路与 &&，短路或 ||
            其中重点学习短路与，短路或照葫芦画瓢。
         */
        System.out.println(true & true);//true
        System.out.println(true &false);//false
        System.out.println(false & false);//false

        System.out.println(true && true);//true
        System.out.println(true && false);//false
        System.out.println(false && false);//false

        int x = 10;
        int y = 11;
        System.out.println(x > y &x > y++);//y++执行了
        System.out.println(y);//12

        int m = 10;
        int n = 11;
        System.out.println(m > n && m > n++);//n++不执行
        System.out.println(n);
    }
}
