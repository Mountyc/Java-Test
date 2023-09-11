package chapeter10;

public class PersonTest02 {
    public static void main(String[] args){
        //创建对象
        Person p1 = new Person();
        //Person的age，彻底在外部不能访问了。但是这难免有点太安全了。
        //age不能访问，这个程序彻底就意义不大了。
        /*
        //读age属性的值
        System.out.println(p1.age);

        //修改age属性的值
        p1.age = 20;

        //读age
        System.out.println(p1.age);
         */
        //读调用getAge（）方法
        /*
        int nianLing = p1.getAge();
        System.out.println(nianLing);//0

         */
        //代码联合
        System.out.println(p1.getAge());
        //改调用setAge（）方法
        p1.setAge(20);
        System.out.println(p1.getAge());

        p1.setAge(-100);
        System.out.println(p1.getAge());
    }
}
