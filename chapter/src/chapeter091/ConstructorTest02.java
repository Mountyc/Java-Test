package chapeter091;

public class ConstructorTest02 {
    public static void main(String[] args) {
        //调用不同的构造方法创建对象
        chapeter091.Vip v1 = new chapeter091.Vip();
        System.out.println(v1.no);//0
        System.out.println(v1.name);//null
        System.out.println(v1.birth);//null
        System.out.println(v1.sex);//false

        chapeter091.Vip v2 = new chapeter091.Vip(1111, "大灰狼");
        System.out.println(v2.no);//1111
        System.out.println(v2.name);//"大灰狼"
        System.out.println(v2.birth);//null
        System.out.println(v2.sex);//false

        chapeter091.Vip v3 = new chapeter091.Vip(2222, "小绵羊", "2000-12-13");
        System.out.println(v3.no);//2222
        System.out.println(v3.name);//"小绵羊"
        System.out.println(v3.birth);//"2000-12-13"
        System.out.println(v3.sex);//false

        chapeter091.Vip v4 = new chapeter091.Vip(3333, "钢铁侠", "1998-12-5", true);
        System.out.println(v4.no);//3333
        System.out.println(v4.name);//"钢铁侠"
        System.out.println(v4.birth);//"1998-12-5"
        System.out.println(v4.sex);//true
    }
}
