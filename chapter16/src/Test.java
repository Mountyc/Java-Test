public class Test {
    public static void main(String[] args) {
        //创建厨师对象
        FoodMenu cooker1 = new ChinaCook();
        //创建顾客对象
        Customer customer = new Customer(cooker1);
        //顾客点菜
        customer.order();
    }
}
