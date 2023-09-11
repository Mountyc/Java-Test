package chapeter07;
/*
    对于一个Java程序，如果没有方法会存在什么问题？
        代码无法得到复用。（怎么提高复用性，可以定义方法，然后需要
        使该功能的时候，直接调用一下方法即可）
 */

public class MethodTest01 {
    public static void main(String[] args){//自上而下

        int x = 100;
        int y = 200;
        int z = x + y;
        System.out.println(x + "+" + y + "=" + z);
    }
}
