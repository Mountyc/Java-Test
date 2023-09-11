package chapeter06;
/*
            for循环的语法机制以及运行原理?
            语法机制:
              for(初始化表达式;条件表达式;更新表达式){
              循环体;//循环体由java语句构成
              java语句;
              java语句;
              java语句;
              java语句;
              ....
           }
           注意:
             第一:初始化表达式最先执行，并且在整个循环中只执行一次。
             第二:条件表达式结果必须是一个布尔类型，也就是:true或false
             执行原理:
             先执行初始化表达式，并且初始化表达式只执行1次。
             然后判断条件表达式的结果，如果条件表达式结果为true，则执行循环体。
             循环体结束之后，执行更新表达式。
             更新完之后，再判断条件表达式的结果，如果还是true，继续执行循环体。

             直到更新表达式执行结束之后，再次判断条件时，条件为false for循环终止。

             更新表达式的作用是:控制循环的次数，换句话说，更新表达式会更新
             某个变量的值，这样条件表达式的结果才有可能从true变成false，从而
             终止for循环的执行，如果确实更新表达式，很有可能会导致死循环。
 */
public class ForTest02 {
    public static void main(String[] args){
        //最简练的for循环
        //初始化表达式、条件表达式、更新表达式 其实都不是必须的！！！
        for(int i = 0;i <10;i++){
            System.out.println("i = " + i);
        }
        //错误找不到符号
        //System.out.println(i);
        int i =0;
        for(;i <10;i++){
            System.out.println("i = " + i);
        }
        System.out.println("这里i可以访问" + i);
        //变形
        for (int k = 1;k <= 10;k++){
            System.out.println("k = " + k);//1 2 3 4 5 6 7 8 9 10
        }
        //变形
        for (int k = 1;k <= 10;){
            System.out.println("k = " + k);
            k++;
        }
        //变形
        for (int k = 1;k <= 10;){
            k++;
            System.out.println("number = " + k);//2 3 4 5 6 7 8 9 10 11

        }
    }
}
