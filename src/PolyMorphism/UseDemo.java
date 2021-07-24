package PolyMorphism;
//compile time polymorphism
class  Demo{
    public void show(int x){//overloding method
        System.out.println(x);
    }
    public String show(String s){
        return (s);
    }
    public int show(int a,int b){
        return a+b;
    }
    public double show(double a,double b){
        return  a+b;
    }
}
public class UseDemo {
    public static void main(String[] args) {
        Demo O = new Demo();
        O.show(4);
        String S = O.show("Abhishek");
        System.out.println(S);
        System.out.println(O.show(4,5));
        System.out.println(O.show(4.5,63.5));
    }
}
