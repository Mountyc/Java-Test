package chapeter013;
//经过测试，你记住就行
//私有方法不能覆盖
public class OverrideTest06 {
    //私有方法
    private void doSome(){
        System.out.println("OverrideTest06's private method doSome execute!");
    }
    //入口
    public static void main(String[] args){
        //多态
        OverrideTest06 ot =new T();
        ot.doSome();
    }
}
class T extends OverrideTest06{
    //尝试从写父类当中的doSome方法
    //访问权限不能更低，可以更高
    public  void doSome(){
        System.out.println("T's public doSome method execute!");
    }
}

