package chapeter12.chapeter04;
/*
    结论：byte、char、short做混合运算时候，各自先转换成int再做运算
 */
public class IntTest05 {
    public static void main (String[] args){
        char c1 = 'a';
        byte b = 1;
        System.out.println(c1+b);//98
        short s = (short)(c1+b);
        int a = 1;
       short x  = 1;//可以
       // short x = a;不行
        System.out.println(x);
    }
}
