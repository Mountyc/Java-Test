package string;

import java.security.spec.RSAOtherPrimeInfo;

public class StringTest05 {
    public static void main(String[] args) {

        //String类当中常用方法
        //1（掌握）.char charAt（int index）
        char c = "中国人".charAt(1);//中国人是一个字符串String对象。只要是对象就能“点.”
        System.out.println(c);//国

        //2(了解).int compareTo(String anotherString)
        int result = "abc".compareTo("abc");
        System.out.println(result);//0(等于0) 前后一致 10 -10 0

        int result2 = "abcd".compareTo("abce");
        System.out.println(result2);//-1(小于0) 前小后大 8 - 9 = -1

        int result3 = "abce".compareTo("abcd");
        System.out.println(result3);//1(大于0) 前大后小 9 - 8 = 1

        //拿着字符串第一个和后面的字符串的第一个字母比较。能分出胜负就不在比较了
        System.out.println("xyz".compareTo("yxz"));// -1

        //3(掌握).boolean contains(CharSequence s)
        //判断前面的字符串中是否包含后面的字符串。
        System.out.println("HelloWorld.java".contains(".java"));//true
        System.out.println("http://www.baiodu.com".contains("https://"));//false

        //4(掌握).boolean endWith(String suffix)
        //判断当前字符串是否以某个字符串结尾
        System.out.println("test.txt".endsWith(".java"));//false
        System.out.println("test.txt".endsWith(".txt"));//true
        System.out.println("avhsudhbsdfvsdvvavddadss".endsWith("ss"));

        //5(掌握).boolean equals(Object anObject)
        //比较两个字符串必须使用equals方法，不能使用”==“
        //equals方法有没有调用compareTo方法？老版本可以看下。
        System.out.println("abc".equals("abc"));//true

        //6(掌握).boolean equals (String anotherString)
        //判断两个字符串是否相等，并且同时忽略大小写。
        System.out.println("abc".equalsIgnoreCase("abc"));//true

        //7(掌握).byte[] getBytes()
        // 将字符串对象转换成字节数组
        byte[] bytes = "abcdef".getBytes();
        for (int i = 0; i < bytes.length; i++){
            System.out.println(bytes[i]);
        }

        //8(掌握).int indexOf(String str)
        //判断某个子字符串在当前字符串中第一次出现的索引（下标）。
        System.out.println("oraclejavac++.netc#phppythonjavaoraclec++".indexOf("java"));//6

        //9(掌握)。boolean isEmpty()
        //判断某个字符串是否为空"空字符串"。底层源代码调用的应该是字符串的length()方法
        //String s="";
        String s = "a";
        System.out.println(s.isEmpty());

        //10(掌握).int length()
        //面试题：判断数组长度和判断字符串长度不一样
        //判断数组长度是length属性，判断字符串长度是length()方法
        System.out.println("abc".length()); //3
        System.out.println("".length()); //0

        //11(掌握).int lastIndexOf(String str)
        //判断某个子字符串在当前字符串中最后一次出现的索引（下标）
        System.out.println("oraclejavac++.netc#phppythonjavaoraclec++".lastIndexOf("java"));

        //12(掌握).String replace(CharSequence target，CharSequence replacement)
        //替换。
        //String的父接口就是：CharSequence
        String newString = "http://www.baidu.com".replace("http://","https://");
        System.out.println("newString");
        //以下字符串中的”=“替换”：“
        String newString2 = "name=zhangsan&password=123&age=20".replace("=",":");
        System.out.println(newString2);

        //13(掌握).String[] split(String regex)
        //拆分字符串
        String[] ymd = "1980-10-11".split("-");
        for (int i = 0; i < ymd.length; i++) {
            System.out.println(ymd[i]);
        }
        String param = "name=zhangsan&password=123&age=20";
        String[] params = param.split("&");
        for (int i = 0; i < params.length; i++) {
            System.out.println(params[i]);
            //继续向下拆分”=“
        }

        //14(掌握).boolean startsWith(String prefix)
        //判断某个字符串是否以某个字符串开始。
        System.out.println("http://www.baidu.com".startsWith("http"));//true
        System.out.println("http://www.baidu.com".startsWith("https"));//false


        //15(掌握).String substring(int beginIndex)参数是起始下标
        //截取字符串
        System.out.println("http://www.baidu.com".substring(7));//www.baidu.com

        //16(掌握).String substring(int beginIndex,int endIndex)
        //beginIndex 起始位置（包括）
        //endIndex 结束位置（不包括）
        System.out.println("http://www.baidu.com".substring(7,10));//www

        //17(掌握).char[] toCharArray()
        //将字符串转换成char数组
        char[] chars = "我是中国人".toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        //18(掌握).String toLowerCase()
        //转换为小写
        System.out.println("ABCDefKXyz".toLowerCase());

        //19(掌握).String toUpperCase()
        System.out.println("ABCDefKXyz".toUpperCase());

        //20(掌握).String trim();
        //去除字符串前后空白
        System.out.println("      hello    world         ".trim());

        //21(掌握).String 中只有一个方法是静态的，不需要new对象
        //这个方法叫做valueOf
        //作用：将”非字符串“转换成“字符串”
        //String s1 = String.valueOf(true);
        //String s1 = String.valueOf(100);

        //这个静态的valueOf（）方法，参数是一个对象的时候，会自动调用该对象的toString（）方法
        String s1 = String.valueOf(new Customer());//没有重写toString（）方法之前是对象内存地址
        System.out.println(s1);//我是一个Vip客户

        //研究一下println()方法的源代码
        System.out.println(100);

        Object obj = new Object();
        //通过源代码可以看出：为什么输出一个引用的时候，会调用toString（）方法！！！
        //本质上System.out.println()这个方法在输出任何数据的是时候都是先转成字符串，在输出。
        System.out.println(obj);
    }
}
class Customer{
    //重写toString方法

    public String toString(){
        return "我是一个Vip客户";
    }
}
