package Interface;
interface h1{
    final int a = 10;
    void display();
}
public class TestClass  implements  h1{
    public void display(){
        System.out.println("interface");
    }

    public static void main(String[] args) {
        TestClass t = new TestClass();
        t.display();
        System.out.println(a);
    }
}
