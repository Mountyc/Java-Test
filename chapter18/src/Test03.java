/*
    java语言当中的字符串string有没有重写toString方法，有没有重写equals方法。

    总结:
    1、string类已经重写了equals方法，比较两个字符串不能使用-=，
    必须使用equals equals是通用的。
    2、string类已经重写了toString方法。

    大结论:
        java中什么类型的数据可以使用"=="判断
        java中基本数据类型比较是否相等，使用==

        java中什么类型的数据需要使用equals判断
        java中所有的引用数据类型统一使用equals方法来判断是否相等。

        这是规矩。

 */
public class Test03 {
    public static void main(String[] args) {

        //大部分情况下，采用这样的方式创建字符串对象
        String s1 = "Hello";
        String s2 = "abc";
        //实际上String也是一个类，不属于基本数据类型。
        //既然String是一个类，那么一定存在构造方法
        String s3 = new String("Test1");
        String s4 = new String("Test1");
        //new两次，两个对象内存地址，s3保存的内存地址和s4保存的内存地址不同、
        //== 判断的是内存地址，不是内容
        //System.out.println(s3 == s4);//false

        //比较两个字符串不能使用双等号。必须用equals方法
        //String类已经重写equals方法
        System.out.println(s3.equals(s4));//true

        //String类没有重写tiString方法
        String x = new String("特殊节点");
        //如果没有重写将会输出java.lang.String@十六进制的地址
        //经过测试String类已经重写toString()方法
        System.out.println(x.toString());
        System.out.println(x);
    }
}
