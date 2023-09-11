package chapeter10;
/*
    Person表示人类：
        每一个人都有年龄这样的属性。
        年龄age，int类型
     先不使用封装机制，分析程序存在什么区分？
     Person类的age属性对外暴露，可以在外部程序中随意访问，导致不安全。

     封装解决此问题
 */
//这是没有封装的Person
/*
public class Person {
    // 实例变量（属性）
    int age;
}

 */
// 尝试封装一下
// 不在对外暴露复杂的数据，封装起来
// 对外只提供简单的操作入口
// 优点：第一数据更安全。第二调用者也方便了。
public class Person{
    //private 表示私有的，被这个关键字修饰后，该数据只能在本类中访问。
    //出了这个类，age属性就无法访问了。私有的
    private int age;//每一个人年龄不同，对象级别属性。

    //对外提供简单的访问入口
    //外部程序只能通过调用以下的代码来完成访问
    //思考：应该对外提供几个访问入口
    //思考：这些操作入口是否应该的方法
    //写一个方法专门来完成读（get）
    //写一个方法专门来完成写（set）
    //get和set方法应该带有static还是没有static，get和set方法应该定义为实例方法
    //get读年龄，set改年龄，这个读改都是操作的一个对象的年龄（没有对象何来年龄）
    //封装第二步：对外提供公开的set方法和get方法作为操作入口。并且都不带static
    /*
    [修饰符列表] 返回值类型 方法名(形式参数列表){
    }

    注意：
       java开发规范中要求，set方法和get方法要满足以下格式。
        get方法的要求：
            public 返回值类型 get+属性名首字母大写（无参）{
                return xxx;
                }
         set方法的要求：
            public void set+属性名首字母大写（有一个参数）{
                xxx = 参数;
                }
       大家尽量按照java规范中要求的格式提供set和get方法。
       如果不按照这个规范格式要求来，那么你的程序将不是一个通用的程序。
     */
    //get方法
    public int getAge(){
        return age;
    }
    //set方法
    public void setAge(int nianLing){
        //在这个位置上设置关卡
        if(nianLing < 0 || nianLing > 150){
            System.out.println("对不起年龄不合法");
            return;//直接终止程序
        }
        age = nianLing;
    }
}
