//顾客
public class Customer {
    //顾客手里有一个菜单
    //Customer has a FoodMenu!（这句话什么意思：顾客有一个菜单）
    //记住：以后凡是能够使用has a 来描述的，统一以属性的方式存在
    //实例变量，属性
    private FoodMenu foodMenu;

    //构造方法
    public Customer(){

    }
    public Customer(FoodMenu foodMenu){
        this.foodMenu = foodMenu;
    }
    //setter and getter

    public FoodMenu getFoodMenu() {
        return foodMenu;
    }

    public void setFoodMenu(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }

    //提供一个点菜方法
    public void order(){
        //先拿到菜单才能点菜
        //FoodMenu fm = this.getFoodMenu();
        //也可以不调用get方法，因为在本类中私有的属性是可以访问的
        foodMenu.shiZiChaoJiDan();
        foodMenu.YuXiangRoSi();
    }
}
/*
    Cat is a animal,但凡满足is a 的表示都可以设置为继承。
    Customer has a FoodMenu，但凡是满足has a 的表示都可以属性的形式存在。
 */

//"自己"类
//MySelf has a Friend;
/*
class MySelf{
    // 你这个对象，应该有一个朋友对象的电话号码。
    // 电话号码就是一个对象的内存地址。联系你朋友的时候，打电话。
    // f是一个引用。f默认值是null，是null表示，你没有朋友。
    Friend f;

    public MySelf(){
    }

    //通过构造方法能不能给你一个朋友对象。
    public MySelf(Friend f){
        this.f=f;
      }

    public static void main(string[] args){
    // 创建朋友对象
    Friend f=newFriend();//朋友对象有了

    //创建对象的同时交朋友。
    MySelf m2 = new MySelf(f)

    // 创建自己对象
    // 目前还没有交朋友。
    MySelf m=new MySelf();//自己对象
     //交朋友
    m.f=f;// 把朋友的地址给了你。

   
    //"朋友"类
    class Friend{
    }

 */