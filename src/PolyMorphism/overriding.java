package PolyMorphism;
//overriding runtime polymorphsim
class Parent{
    void print(){
        System.out.println("parent");
    }
}
class subclass1 extends Parent{
    void print(){
        System.out.println("Subclass 1");
    }
}
class subclass2 extends Parent{
    void print(){
        System.out.println("Subclass 2");
    }
}
public class overriding {
    public static void main(String[] args) {
        Parent a;
        a = new subclass1();
        a.print();
        a = new subclass2();
        a.print();
    }
}
