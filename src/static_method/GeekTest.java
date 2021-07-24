package static_method;

import java.util.Scanner;

class Geek{
    static int count ;//static variable
    String name;
    public Geek(String name){//constructor with geek
        this.name = name;
        count++;//each time object created count get increase;
    }
    public static int GetCount(){//static method
        return count;
    }
    public String getName(){//normal method
        return name;
    }

}
public class GeekTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//scanner
        Geek g = new Geek(sc.nextLine());//taking string input

        String s = g.getName();//calling normal method
        System.out.println("Name : " + s + "\n");
        int val = Geek.GetCount();//calling static method using class name;
        System.out.println("Number Of Object Created is :: " + val);
    }
}
