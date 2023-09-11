package chapeter11;

public class HomeWork03 {
    public static void main(String[] args){
        //先创建一个账户对象
        Account a = new Account("1000",2000,1.23);
        //创建一个客户对象
        //传给构造方法a是什么意思让Customer01对象和Account对象产生关系
        //表示这个账户是Smith的
        Customer01 c = new Customer01("Jane Smith" ,a);
        /*
        对Jane Smith操作
            存入100元
            取出960元
            在取出2000元
         */
        c.getAct().deposit(100);
        c.getAct().withdraw(960);
        c.getAct().withdraw(2000);
    }
}
//客户类
class Customer01{
    //客户名字
    private String name;
    //客户手里应该有名字
    private Account act;
    //构造方法
    public Customer01(){

    }
    public Customer01(String name,Account act){
        this.name = name;
        this.act = act;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAct(Account act) {
        this.act = act;
    }

    public Account getAct() {
        return act;
    }


}
//账户类
class Account{
    //账户id
    private String id;
    //余额
    private double balance;
    //年利率
    private double annualInterestRate;
    //构造方法
    public Account(){

    }
    public Account(String id, double balance,double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getId(){
        return id;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    //存款方式
    public void deposit(double money){
        //this(向this指向的对象中存款）
        //this.balance = this.balance + money;
        //this.balance += money;
        //调用方法来进行修改余额
        this.setBalance(this.getBalance() + money);
        System.out.println("成功存入："+ money);
    }
    //取款方式
    public void withdraw(double money){
        //this(从this指向的对象中取款）
        if (money > this.getBalance()){
            System.out.println("余额不足，取钱失败");
            return;
        }
        //程序能执行到这说明余额充值
        this.setBalance(this.getBalance() - money);
        System.out.println("成功取出：" + money);
    }
}