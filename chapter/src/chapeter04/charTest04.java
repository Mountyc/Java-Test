package chapeter04;
/*
    1.整数能否直接赋值给char
    2.char x = 97;
    允许的，输出结果为'a'
        第一个结论：当一个整数赋值给char类型变量时，会自动转换成char字符型
        第二个结论: 当一个整数没有超出byte short char的取值范围时候
        这个整数可以直接赋值给byte short char类型变量。
 */

public class charTest04 {
    public static void main (String[] args){

        char c1 = 'a';
        System.out.println(c1);

        char c2 = 97;
        System.out.println(c2);

        char c3 = 65535;
        System.out.println(c3);


    }
}
