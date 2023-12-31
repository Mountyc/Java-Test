package Array;
/*
    一维数组的深入，数组中存储的类型为：引用数据类型
    对于数组来说，实际上只能存储java对象的”内存地址“。数组中存储的每个元素都是”引用“。
 */
public class ArrayTest07 {
    public static void main(String[] args) {

        //a是一个数组
        //a[0]是数组中的一个元素
        //a[1]是数组中的一个元素
        int[] a = {100,200,300};
        System.out.println(a[1]);
        //a[2] = 400
        int[] array = {1,2,3};
        for (int i = 0; i < array.length; i++) {
            /*int temp = array[i];
            System.out.println(temp);*/
            System.out.println(array[i]);
        }
        //创建一个Animal类型的数组
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        Animal[] animals = {a1,a2};

        //对Animal数组进行遍历
        for (int i = 0; i < animals.length; i++) {
            /*
            Animal a = animals[i];
            a.move();
             *///代码合并
            animals[i].move();
        }
        //动态初始化一个长度为2的Animal类型数组
        Animal[] ans = new Animal[2];
        //创建一个Animal对象，放到这个数组的第一个盒子中
        ans[0] = new Animal();

        //Animal数组中只能存放Animal类型，不能存放Product类型
        //ans[1] = new Product;

        //Animal数组中可以存放Cat类型的数据，因为Cat是一个Animal
        //Cat是animal的子类
        ans[1] = new Cat();

        //创建一个animal类型的数组，数组当中存储Cat和Bird
        /*
        Cat c = new Cat();
        Bird b = new Bird();
        Animal anis = {c,b};
         */
        Animal[] anis = {new Cat(),new Bird()};//该数组中存储了两个对象的内存地址
        for (int i = 0; i < anis.length; i++) {
            //这个取出来的可能是Cat，也可能是Bird，不过肯定是个Animal
            //如果调用的方法是父类中存在的方法不需要向下转型。直接使用父类型引用调用即可
            //anis[i];
            //Animal an = anis[i];
            //an.move();

            //animal中没有sing方法
            //anis[i].sing();
            //调用子类中特有的方法的话，需要向下转型！！！
            if(anis[i] instanceof Cat){
                Cat cat = (Cat)anis[i];
                cat.catchMouse();
            }else if(anis[i] instanceof Bird){
                Bird bird = (Bird) anis[i];
                bird.sing();
            }
        }

    }
}
class Animal{
    public void move(){
        System.out.println("Animal move");
    }
}
class Product{

}
//cat是子类
class Cat extends Animal{
    public void move(){
        System.out.println("猫在走猫步");
    }
    //特有方法
    public void catchMouse(){
        System.out.println("猫在抓老鼠");
    }
}
//Bird 是子类
class Bird extends Animal{
    public void move(){
        System.out.println("Bird fly!");
    }
    //特有方法
    public void sing(){
        System.out.println("鸟儿在唱歌！！！");
    }
}

