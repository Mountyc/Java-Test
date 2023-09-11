package chapeter04;

//关于转义字符
public class charTest03 {
    public static void main(String[] args){

        //普通的‘t'字符
        char c1 = 't';
        System.out.println(c1);

        //char x = ’ab'；
        //经过之前所学，以下代码应该报错。
        //经过测试以下代码\t实际上是一个字符，不属于字符串
        //两个字符合在一起表示一个字符。其中\t表示“制表符tab”
        char c2 = '\t';

        System.out.println("a b c d e f");
        System.out.println("a b c \t d e f");

        //System.out.println();换行
        //System.out.print();不换行
        //char c3 = n;
        char c3 = '\n';
        System.out.println("HelloWorld");


        //(\'联合起来表示一个普通的 ’ ）
        System.out.println("\'");
        //(\\联合起来表示一个普通的 \ )
        System.out.println("\\");
        //(\"联合起来表示一个普通的 " )
        System.out.println("\"");

        //反斜杠u表示后面的是一个unicode编码
        //unicode编码是十六进制的。
        char X = '\u4e2d';
        System.out.println(X);
    }
}
