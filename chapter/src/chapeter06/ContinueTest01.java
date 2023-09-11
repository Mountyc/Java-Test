package chapeter06;
/*
        continue语句：
            1.continue翻译为:继续
            2.continue语句和break语句要对比着学习
            3.continue语句的作用：
                终止当前本次循环，直接进入下一次循环执行。
                for(){//当这个条件成立时。执行continue语句
                continue;//当这个continue语句条件执行时，continue语下面的代码不执行，直接跳过
                }
                //以上的continue一旦执行，以下代码不执行，直接更新表达式。
                code1;
                code2;
                code3;
                code4;
                }
           4.continue语句后面可以指定循环
            a:for(;;更新表达式1){
                b:for(;;更新表达式2){
                    if(){
                        continue a;
                      }
                        code1;
                        code2;
                        code3;
                     }
                 }

 */
public class ContinueTest01 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                //break语句：会让离他最近的循环终止结束掉
                break;//break；终止的不是if，不是针对if的，而是针对离他最近的循环。
            }
            System.out.println("i = " + i);
        }
        System.out.println("-------------------------------");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {

                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
