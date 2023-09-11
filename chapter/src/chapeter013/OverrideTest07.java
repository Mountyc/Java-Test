package chapeter013;

public class OverrideTest07 {
    public static void main(String[] args){
        //一般重写的时候都是复制粘贴。不要动，不要改。
    }
}
class Animal03{
    /*
    public double sum(int a,int b){
        return a + b;
    }
    public long sum(int a, int b){
        return a + b;
    }
    public int sum(int a, int b){
        return a + b;
    }
     */

}
class Cat03 extends Animal03{
    //重写
    //错误：Cat中的sum(int,int)无法覆盖Animal中的sum（int，int）
    /*
    public int sum(int a, int b){
        return a + b;
    }
     */

    /*
    public double sum(int a, int b){
        return a + b;
    }
     */

    /*
    //错误：Cat中的sum(int,int)无法覆盖Animal中的sum（int，int）
     */

    /*
    public long sum(int a, int b){
        return a + b;
    }
     */
}
//父类
class MyClass01{
    public Animal03 getAnimal03(){
        return null;
    }
}
class MyClass02 extends MyClass01{
    //重写父类的方法
    /*
    public Animal getAnimal03(){
        return null;
    }
     */
    //重写的时候返回值类型由Animal变成了Cat，变小了。（可以。java中允许）
    /*
    public Cat getAnimal()03{
        return null;
    }
     */

    //重写的时候返回值类型由Animal变成了Object，变大了(不行。java中不允许）
    /*
    public Object getAnimal03(){
        return null;
    }

     */
}
