package chapeter12;
//  使用继承机制来解决代码复用问题
// 继承也是存在缺点的机制：耦合度高，父类修改，子类收牵连。
public class ExtendsTest02 {
    public static void main(String[] args){

    }
}
//银行账户类
//银行的属性：账户，余额
class Account02{
    //属性
    private String actno;
    private double balance;
    //构造方法
    public Account02(){

    }
    public Account02(String actno,double balance){
        this.actno = actno;
        this.balance = balance;
    }
    //setter和getter

    public void setActno(String actno) {
        this.actno = actno;
    }
    public String getActno(){
        return actno;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
}
//其他类型账户：信用卡账户
//账号，余额，信誉度
class CreditAccount02 extends Account02{
    //属性
    private double credit;
    //构造方法
    public CreditAccount02(){

    }
    public CreditAccount02(double credit){

        this.credit = credit;
    }
    //setter和getter
    public void setCredit(double credit) {
        this.credit = credit;
    }
    public double getCredit() {
        return credit;
    }
}