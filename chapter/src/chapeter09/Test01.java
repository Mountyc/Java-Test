package chapeter09;
// 分析程序执行的结果.
// java中规定：参数传递的时候，和类型无关，不管是基本数据类型还是引用数据类型
// 统一将盒子中保存的那个值复制一份，传递下去。

// java中只有一个规定：参数传递的时候，一定是将“盒子”中的东西复制一份传递过去

// 内存地址也是值，也是盒子中保存的一个东西。

public class Test01 {
    public static void main(String[] args){
        int x = 100;
        int y = x;//x赋值给y，将变量中保存的100这个值复制一份传给y

        // 局部变量，域是main
        int i = 10;
        //将i变量中保存的10复制一份，传给add方法
        add(i);
        System.out.println("main --->" + i);//10
    }
    public static void add(int i){ // i是局部变量，域是add
        i++;
        System.out.println("add--->" +i); // 11
    }
}
