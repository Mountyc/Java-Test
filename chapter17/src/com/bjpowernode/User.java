package com.bjpowernode;

public class User {
    //给一些属性
    //私有的
    private int id;
    //受保护的
    protected int age;
    //公开的
    public int weight;
    //默认的
    String name;
    //方法
    public void m1(){}
    private void m2(){}
    void m3(){}
    protected void m4(){}

    //静态方法也可以
    public static void x(){}
    private static void y(){}
    static void z(){}
    protected void k(){}

}
//错误此处不允许使用修饰符号private
/*
private class MyClass1{}
 */

//错误此处不允许使用修饰符号protected
/*
protected class MyClass1{}
 */
class MyClass1{}