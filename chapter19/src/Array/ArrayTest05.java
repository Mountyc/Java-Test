package Array;
/*

 */
public class ArrayTest05 {
    //这个方法程序员负责写出来，JVM负责调用。JVM调用的时候一定会传一个String数组过来。
    public static void main(String[] args) {
        //JVM默认传递过来的这个数组对象的长度？默认0
        //通过测试得出：args不是null
        System.out.println("JVM给传递过来的String数组参数，他的数组长度为"+ args.length);

        //以下这一行代码表示的含义:数组对象创建了，但是数组中没有任何数据。
        // String[] strs=newString0];
        // String[]strs={};
        // 静态初始化数组，里面没东西。
        // printLength(strs);

        // 这个数组什么时候里面会有值呢?
        // 其实这个数组是留给用户的，用户可以在控制台上输入参数，这个参数自动会被转换为“String[l args”
        // 例如这样运行程序:java ArrayTest05 abc def xyz
        // 那么这个时候JVM会自动将“abc def xyz”通过空格的方式进行分离，分离完成之后，自动放到“String[1 args”数组
        // 所以main方法上面的String[]args数组主要是用来接收用户输入参数的。//把abc def xyz转换成字符串数组:{"abc""def""xyz"
        //遍历数组
        for (int i = 0;i < args.length;i++){
            System.out.println(args[i]);
        }
    }
}
