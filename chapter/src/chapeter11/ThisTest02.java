package chapeter11;

public class ThisTest02 {
    //实例变量
    int i = 100;
    //静态变量
    static int k = 111;
    //静态方法
    public static void main(String[] args){
        // System.out.println(i);

        //怎么样访问i
        ThisTest02 tt = new ThisTest02();
        System.out.println(tt.i);

        //静态变量用“类名.”访问。
        System.out.println(ThisTest02.k);
        //类名可省略
        System.out.println(k);
    }
}
