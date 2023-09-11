package stringbuffer;

public class StringBufferTest04 {
    public static void main(String[] args) {

        //字符串不可变是什么意识
        //是说双引号里面的字符串对象一旦创建不可变。
        String s = "abc";//"abc"放到了字符串常量池当中。"abc"不可变。

        //s是变量可以指向其他对象的。
        //字符串不可变不是说以上变量s不可变，说的是”abc“这个对象不可变
        s = "xyz";//"xyz"放到了字符串常量池当中。"xyz"不可变。
    }
}
