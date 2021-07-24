package Constructor;

abstract class Duck{//creating abstract class
    int size;
    public Duck(){//default constructor
        size = 20;
    }
    public Duck(int size){//base class constructor
        this.size = size;
    }
    public  abstract void getSize();//if class contain abstract method then class markas abstract
}
class DuckImplement extends Duck{//inheritance
    public DuckImplement(){//for default constructor in base class

    }
    public DuckImplement(int size){//derived class constructor then using super invoke base class constructor;
        super(size);//super use to onvoe base class
    }
    public void getSize(){//overriding base class method//runtime polymorphism
        System.out.println(size);
    }
}
public class DuckTest {
    public static void main(String[] args) {
        DuckImplement d = new DuckImplement(4);
        DuckImplement d1 = new DuckImplement();//default constructor
        d.getSize();
        d1.getSize();
    }
}
