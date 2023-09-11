package chapeter06;
/*

 */


import java.util.Scanner;

public class IfTest02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入年龄");
        int age = s.nextInt();
        //
        //System.out.println("测试以下，您输入的年龄是：" + age);
        /*
        if(age>150 || age<0){
            System.out.println("对不起年龄不合法");
        }else{
            //能够走到这个分支，说名年龄合法
            if (age <= 5){
                System.out.println("婴幼儿");
            } else if (age <= 10) {
                System.out.println("少儿");
            } else if (age <= 18) {
                System.out.println("少年");
            } else if (age <= 35) {
                System.out.println("青年");
            } else if (age <= 55) {
                System.out.println("中年");
            } else {
                System.out.println("老年");
            }
        }
        */

        /*
        不嵌套。
        if (age > 150 || age < 0) {
            System.out.println("对不起年龄不合法");
        } else if (age <= 5) {
            //能够走到这个分支，说名年龄合法
            System.out.println("婴幼儿");
        } else if (age <= 10) {
            System.out.println("少儿");
        } else if (age <= 18) {
            System.out.println("少年");
        } else if (age <= 35) {
            System.out.println("青年");
        } else if (age <= 55) {
            System.out.println("中年");
        } else {
            System.out.println("老年");
        }
         */
        //进一步改良
        String str = "老年";
        if (age > 150 || age < 0) {
            System.out.println("对不起年龄不合法");
            return;
        } else if (age <= 5) {
            //能够走到这个分支，说名年龄合法
            str = "婴幼儿";
        } else if (age <= 10) {
            str = "少儿";
        } else if (age <= 18) {
            str = "少年";
        } else if (age <= 35) {
            str = "青年";
        } else if (age <= 55) {
            str = "中年";
        }
        System.out.println(str);
    }
}

