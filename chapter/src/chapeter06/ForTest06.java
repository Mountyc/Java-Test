package chapeter06;
/*
       九九乘法表
       1*1=1
       1*2=2 2*2=4
       1*3=3 2*3=6 3*3=9
       ......
       1*9=9 2*9=18 3*9=27...................9*9=81

       特点一：共九行
       特点二：一行一个，第二行二个第n行n个；
       最重要的是：不要慌，慢慢把思路捋出来，再写代码。
 */
public class ForTest06 {
    public static void main(String[] args){
        //9行循环9次
        for(int i = 1;i <= 9;i++){//纵向循环
          // System.out.println(i);
            for(int j = 1;j <= i; j++){
                System.out.print(i + "*" + j + "=" + i * j + " ");
            }
            //换行
            System.out.println();
        }
    }
}
