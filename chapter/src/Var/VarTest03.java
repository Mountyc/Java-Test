package Var;
/*
    变量作用域
    变量的有效范围（出大括号就不认识）
    就近原则（哪个离我近，就访问哪一个）
 */
public class VarTest03 {
    //成员变量
    int i = 100;
    public static void main (String[] args){
        //局部变量
        int k = 200;//main方法结束k内存空间释放

    }
    public static void x(){
        //局部变量
        int k = 100;//k与main方法中的k不在同一个域中，不冲突。
    }

}
