package tamrin1;
import javax.sql.rowset.spi.SyncResolver;

public class Person {
    private String UserName;
    private String name;
    private String password;
    private int age;
    private String location;
    private int phoneNumber;
    private String academic;
    public Person(String UserName,String name,String password,int age,String location,int phoneNumber,String academic){
        this.UserName=UserName;
        this.name=name;
        this.password=password;
        this.age=age;
        this.location=location;
        this.phoneNumber=phoneNumber;
        this.academic=academic;
    }
    public Person setUserName (String UserName){
        this.UserName=UserName;
        return this;
    }
    public Person setname(String name){
        this.name=name;
        return this;
    }
    public Person setpassword(String password){
        this.password=password;
        return this;
    }
    public Person setage(int age){
        this.age=age;
        return this;
    }
    public Person setlocation(String location){
        this.location=location;
        return this;
    }
    public Person setphoneNumber(int phoneNumber){
        this.phoneNumber=phoneNumber;
        return this;
    }
    public Person setacademic(String academic){
        this.academic=academic;
        return this;
    }
    public User creatUser(){
        return new User(UserName,name,password,age,location,phoneNumber,academic);
    }
}
