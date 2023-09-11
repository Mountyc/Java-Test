package chapeter05;
/*
    算学运算符：
        + 求和
        - 相减
        * 乘积
        / 商
        % 求余数（求模）
        ++ 自加1
        -- 自减1
      对于++运算符来：
        可以出现在变量前也可以出现在变量后
        不管出现在变量的前后，总之++执行结束之后，变量的值一定会自加1.
 */

public class OperatorTest01 {
    public static void main (String[] args){
        int a = 10;
        int b = 3;
        System.out.println(a + b);//13
        System.out.println(a - b);//7
        System.out.println(a * b);//30
        System.out.println(a / b);//3
        System.out.println(a % b);//1
        //重点掌握++和--
        //这里重点讲解++，至于--照葫芦画瓢

        int i = 10;
        i++;
        System.out.println(i);//11

        int k = 10;
        ++k;
        System.out.println(k);//11

        int m = 20;
        int n = m++;
        System.out.println(n);//20
        System.out.println(m);//21

        int x = 100;
        int y = ++x;
        System.out.println(x);//101
        System.out.println(y);//101
    }

}
