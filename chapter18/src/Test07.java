public class Test07 {
    public static void main(String[] args) {
        Object o = new Object();
        int hashCodeValue = o.hashCode();

        //对象内存地址经过哈希算法转换成一个数字。可以等同看作内存地址。
        System.out.println(hashCodeValue);//2129789493

    }
}
