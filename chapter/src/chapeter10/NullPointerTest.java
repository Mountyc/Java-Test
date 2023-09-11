package chapeter10;
/*
    空指针异常导致的最本质原因是？
        空引用访问“实例相关的数据”，会出现空指针异常。

        实力相关的包括：实例变量 + 实例方法。
 */
public class NullPointerTest {
    public static void main(String[] args){
        User u = new User();
        System.out.println(u.id);//0
        u.doSome();

        //引用变成null
        u = null;
        //id的访问，需要对象的存在。
        //System.out.println(u.id);//空指针异常

        //一个实例方法的调用也必须有对象的存在。
        //u.doSome();//空指针异常
    }
}

//类 = 属性 + 方法
//属性描述状态
//方法描述行为动作
class User{
    //实例变量
    int id;
    //实例方法（对象相关的方法，对象的级别方法，应该是一个对象级别的行为）
    //方法描述行为动作
    public void doSome(){
        System.out.println("do some!");
    }
}
