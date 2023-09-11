package chapeter12;

public class ExtendsTest01 {
    public static void main(String[] args){
        //创建普通账户
        Account act = new Account();
        act.setActno("11111");
        act.setBalance(100000);
        System.out.println(act.getActno() + "余额" +act.getBalance());

        //创建信用账户
        CreditAccount ca = new CreditAccount();
        ca.setActno("22222");
        ca.setBalance(-10000);
        ca.setCredit(0.99);
        System.out.println(ca.getActno() + "余额" + ca.getBalance() + "信誉度" + ca.getCredit());

    }
}
//银行账户类
//银行的属性：账户，余额
class Account{
    //属性
    private String actno;
    private double balance;
    //构造方法
    public Account(){

    }
    public Account(String actno,double balance){
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
class CreditAccount{
    //属性
    private String actno;
    private double balance;
    private double credit;
    //构造方法
    public CreditAccount(){

    }
    public CreditAccount(String actno,double balance,double credit){
        this.actno = actno;
        this.balance = balance;
        this.credit = credit;
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
    public void setCredit(double credit) {
        this.credit = credit;
    }
    public double getCredit() {
        return credit;
    }
}