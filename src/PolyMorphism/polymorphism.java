package PolyMorphism;
class Appliance {
    public void turnOn(){
        System.out.println("parent");
    }
}
class Toaster extends Appliance{
    public void turnOn(int a){ //this is overload not override
        System.out.println("Derived");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Toaster t = new Toaster();
        t.turnOn();

    }
}
