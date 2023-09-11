package Array.homework;

import java.util.Scanner;

/**
 * 酒店的房间
 */
public class HotelMgtSystem {
    public static void main(String[] args) {
        //创建酒店对象
        Hotel hotel = new Hotel();
        //打印房间状态
        // hotel.print();

        /*
        首先输出一个欢迎页面
         */
        System.out.println("欢迎使用酒店管理系统，请认真阅读以下说明");
        System.out.println("功能编号对应的功能");
        System.out.println("[1]表示查看房间列表。");
        System.out.println("[2]表示订房。");
        System.out.println("[3]表示退房。");
        System.out.println("[0]表示退出系统。");
        Scanner s = new Scanner(System.in);

        //一直使用
        while (true){
            System.out.println("请输入功能编号");
            int i = s.nextInt();
            if (i == 1) {
                //查看房间列表
                hotel.print();
            } else if (i == 2) {
                System.out.println("请输入订房编号：");
                int roomNO = s.nextInt();
                hotel.order(roomNO);
            } else if (i == 3) {
                System.out.println("请输入退房编号：");
                int roomNO = s.nextInt();
                hotel.exit(roomNO);
            } else if (i == 0) {
                System.out.println("再见，欢迎下次再来！");
                return;
            }else
                //出错了
                System.out.println("请输入正确指令！");

        }
    }
}
