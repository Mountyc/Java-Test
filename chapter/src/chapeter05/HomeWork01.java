package chapeter05;

public class HomeWork01 {
    public static void main(String[] args){
        int x = 10;
        int a = x + x++;
        System.out.println("a =" + a);//x走到这里就是11
        System.out.println("x =" + x);//11
        int b = x + ++x;//23 该行代码结束后，x就是12
        System.out.println("b =" + b);//23
        System.out.println("x =" + x);//12
        int c = x + x--;// 该行代码结束后，x就是11
        System.out.println("c =" + c);//24
        System.out.println("x =" + x);//11
        int d = x + --x;//该行代码结束后，x就是10
        System.out.println("d =" + d);//21
        System.out.println("x =" + x);//10
    }
}
