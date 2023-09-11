package chapeter06;

public class IfTest03 {
    public static void main(String[] args){
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("请输入成绩");
        double score = s.nextDouble();
        String str = "优";
       // System.out.println("测试成绩结果");
        if (score < 0 || score > 100){
            str = "成绩不合法";
            return;
        }else if (score <= 60){
            str = "不及格";
        }else if (score <= 70){
            str = "及格";
        }else if (score <= 80){
            str = "中";
        }else if (score <= 90){
            str = "良";
        }
        System.out.println(str);
    }
}
