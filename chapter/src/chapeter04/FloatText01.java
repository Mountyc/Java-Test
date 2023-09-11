package chapeter04;
/*
    关于Java语言中的浮点型数据
        浮点型包括：
        float       4个字节
        double      8个字节
      float是单精度
      double是双精度

      double更精确
      比如说:
        10.0/3如果采用float来存储的话结果可能是:3.33333
         10.0/3如果米用double来存储的话结果可能是:3.3333333333333
         但是需要注意的是，如果用在银行方面或者说使用在财务方面，double
         也是远远不够的，在java中提供了一种精度更高的类型，这种类型专门
         使用在财务软件方面:java.math.BigDecimal (不是基本数据类型，属于
         引用数据类型。)
    float和double存储数据的时候都是存储的近似值。
为什么?
     因为现实世界中有这种无线循环的数据，例如:3.3333333333333..
     数据实际上是无限循环，但是计算机的内存有限，用一个有限的资源
     表示无限的数据，只能存储近似值。

        long类型占用8个字节。 float类型占用4个字节。哪个容量大?
        注意:任意一个浮点型都比整数型空间大。 float容量>long容量。
        java中规定，任何一个浮点型数据默认被当做double来处理。
        如果想让这个浮点型字面量被当做float类型来处理，那么请在字面量后面添加F/f。
        1.0 那么1.0默认被当做double类型处理。
        1.0F 这才是float类型。(1.0f)
 */
public class FloatText01 {
    public static void main(String[] args){
        double pi = 3.1415926;
        System.out.println(pi);

        float f = (float)3.14;
        System.out.println(f);

        //int i = 10.0/5;
        int i = (int)10/5;
        System.out.println(i);//2

        int x = (int)(10.0/5);
        System.out.println(x);//2
    }

}
