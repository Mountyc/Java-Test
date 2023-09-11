package chapeter06;

public class IfTest04 {
    public static void main (String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("请输入天气");
        int weather = s.nextInt();
        if (weather != 0 && weather != 1) {
            return;
        }
        System.out.println("请输入性别");
        int gender = s.nextInt();
        if (gender != 0 && gender != 1) {
            return;
        }
        if (weather == 1) {
            //System.out.println("雨天");
            if (gender == 1) {
                System.out.println("下雨了，男生记得带黑伞");
            } else if (gender == 0) {
                System.out.println("下雨了，女生记得带花伞");
            }
        } else if (weather == 0) {
            //System.out.println("晴天");
            if (gender == 1){
                System.out.println("天气很好，记得去玩");
            } else if (gender == 0) {
                System.out.println("天气很好，不要乱跑");
            }
        }

    }
}
