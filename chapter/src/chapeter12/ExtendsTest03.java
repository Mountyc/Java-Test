package chapeter12;

public class ExtendsTest03 {
}
class A{}
class B{}
class C extends A{}
//语法错误
//java只允许单继承，不允许多继承。java是简单的，c++支持多重继承。
//C++更接近现实一些。因为在现实生活中儿子同时继承父母两方特征
/*
class D extends A,B{}
 */
class X{}
class Y extends X{}
class M extends X{}
//其实这样也说明了Z是继承X和Y的
//这样描述：直接继承Y，间接继承X
class Z extends Y{}
/*
    z继承了x
    Y继承了X
    X继承了Object

    Z对象具有Object对象的特征（基因）
    Object是所有的类的超类。老祖宗。类体系结构中的根。
    java这么庞大的一个继承结构，最顶点是：Object。
 */