package chapeter06;
/*
    if语句的语法结构以及运行原理
        if 语句是分支语句，也可以叫做条件语句。
        if语句的语法格式：
            第一种写法：
            int a = 100;
            int b = 200;
            if (布尔表达式){
                java语句;
                java语句;
            }
            这里的一个大括号{}叫做一个分支。
            if这个单词翻译为如果，所以又叫做条件语句。
            该语法的执行原理是：
                如果布尔表达式的结果是true，则执行大括号中的程序
                否则大括号中代码不执行。
            第二种写法：
                if（布尔表达式）{
                    java语句;
                }else{
                    java语句;
                }
            执行原理：如果布尔表达式的结果为true，则执行分支1
            分支2不执行。如果布尔表达式的结果是false，则分支1不执行
            执行分支2.
            以上的这个语句可以保证一定有一个分支执行。

            第三种写法：
                if（布尔表达式1）{//分支1
                    java语句;
                }else if（布尔表达式2）{ //分支2
                    java语句;
                }else if（布尔表达式3）{
                    java语句;
                }else if（布尔表达式4）{
                    java语句;
                }
以上if语句的执行原理?
            先判断"布尔表达式1"，如果"布尔表达式1"为true，则执行分支1，然后if语句结束了。
            当"布尔表达式1"结果是false，那么会继续判断布尔表达式2的结果，如果布尔表达式2的结果是true，则执行分支2，然后整个if就结束了。
            从上往下依次判断，主要看第一个true发生在哪个分支上。
            第一个true对应的分支执行，只要一个分支执行，整个if结束。
          第四种写法:
            if(布尔表达式1){//分支1
            java语句;
            }else if(布尔表达式2){// 分支2
            java语句;
            }elseif(布尔表达式3){
            java语句;
            }else if(布尔表达式4){
            java语句;
            }else{
            java语句;// 以上条件没有一个成立的。这个else就执行了。}
            }
        注意：
        1.对于if语句来说，在任何情况下只能有一个分支执行，不可能
        存在2个或者更多个分支执行。if语句中只要有一个执行了，
        整个if语句就结束了（对于一个完整的if语句来说）
        2.以上4种语法机制中，凡是带有else分支的，一定可以保证会有
        一个分支执行。以上4种当中，第一看 第三种没有else分支，这样
        的语句可能会导致最后一个分支都不 行。第二种和第四种肯定会有
        1个分支执行。
        3.当分支当中java语句:"只有1条，那么大括号门可以省略，但为了可读性，最好不要省略。
        (有的程序员在编写代码的时候，可能会故意将大括号!省略，你能看懂就行。)
        4.控制语句和控制语句之间可以嵌套的，但是嵌套的时候大家最好
        一个语句一个语句进行分析，不要沉杂在一起分析。
            if(true){
                if(false){
             //窍门：分析外面if语句的时候，里面的这个if语句可以看作普通的一堆Java代码。
                }else{

                }
              }else{

              }
 */
public class IfTest01 {
    public static void main(String [] args){
        //定义一个布尔类型的变量，表示性别。
        //boolean sex = true;
        boolean sex = false;

        //业务：当sex为true时表示男，为false时表示女
        /*
        if （sex == true){
          System.out.println("男");
         }else{
             System.out.println("女");
        }
         */
        //改良。
        sex = true;
        if (sex){
            System.out.println("男");
        }else{
            System.out.println("女");
        }

        //进一步改良
        //使用三木运算符
        sex = true;
        System.out.println(sex ? "男" : "女");

        //代码可运行但是else永远不会执行。
        sex = false;
        if (sex = true){
            System.out.println("男");//输出"男"
        }else{
            System.out.println("女");
        }

        if (sex)
            System.out.println("男");
        else
            System.out.println("女");

    }
}
