package abstrct;
class A{
    int status;
    public  A(int val){
        status = val;
    }
    public void get_status(){
        System.out.println("Parent");
        System.out.println(status);
    }
}
class B extends A{
    int status;
    public B(int val,int val2){
        super(val);
        status = val2;
    }
    public void get_super(){//this use to get base class method
        super.get_status();
    }
    public void get_status(){
        System.out.println("child");
        System.out.println(super.status);//if both share a common variable,use super to differenciate
        System.out.println(status);
    }
}
public class practice {
    public static void main(String[] args) {
        B b = new B(4,6);
        b.get_status();
        b.get_super();
    }
}
