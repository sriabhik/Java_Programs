package abstrct;
abstract  class Parent{
    abstract void fun();
    void roam(){
        System.out.println("Not-Abstract-Method");
    }
}

class derived extends Parent{
    void fun(){
        System.out.println("Hello");
    }
}

public class Base
{
    public static void main(String[] args) {
        Parent p =  new derived();//create derived class object using base class  Parent
        derived d = new derived();//calling
        d.fun();
        p.fun();
        p.roam();
        d.roam();
    }
}
