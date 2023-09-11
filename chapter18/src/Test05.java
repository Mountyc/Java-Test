//equals 方法重写的时候要彻底。

public class Test05 {
    public static void main(String[] args) {
        User u1 = new User("张三",new Address("北京","大兴区","11111"));
        User u2 = new User("张三",new Address("北京","大兴区","11111"));

        System.out.println(u1.equals(u2));//true

    }
}
class User{
    //用户名
    String name;
    //用户的住址
    Address addr;
    public User(){}
    public User(String name,Address addr){
        this.name = name;
        this.addr = addr;
    }
    //重写equals方法
    //重写规则：当一个用户的用户名和家庭住址都相同，表示同一个用户
    //这个equals判断的是user对象和user对象地址是否相等
    public boolean equals(Object obj){
        //用户和应户名相同，住址和住址相同的时候，认定是同一个用户。
        if(obj == null || !(obj instanceof User)) return false;
        if(this == obj) return true;

        User u = (User) obj;
        if(this.name.equals(u.name) && this.addr.equals(u.addr)){
            return true;
        }
        return false;
    }
}
class Address{
    String city;
    String street;
    String zipcode;
    public Address(){}
    public Address(String city,String street,String zipcode){
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }
    public boolean equals(Object obj){
        if(obj == null || !(obj instanceof Address)) return false;
        if(this == obj) return true;
        //怎么算是家庭住址相同？
        //城市相同，街道相同，邮编相同，表示相同
        Address a = (Address) obj;
        if(this.city.equals(a.city) && this.street.equals(a.street) && this.zipcode.equals(a.zipcode))
        {
            return true;
        }
        return false;
    }

}
