public class Test2 {
    public static void main(String[] args){
        // 这个不加双引号可以
        System.out.println(100);
        //是数字，加双引号行吗

        System.out.println("200 + 100");
        // 以上性质不一样：
        // 一个是字符串，一个是数字；
        // 最终输出到控制台上的样子一样
        System.out.println (200 *200);
        System.out.println( 200 / 100);
    }
}
