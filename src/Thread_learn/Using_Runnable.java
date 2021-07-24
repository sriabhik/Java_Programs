package Thread_learn;
class kinu {
    private int a;
    public void m1(){
        System.out.println("Abhishek");
    }
}
interface k{
    public void go();
}
public class  Using_Runnable extends kinu  implements Runnable ,k{
    @Override
    public void run(){
        System.out.println("Kinu");
    }

    public void go(){
        System.out.println("Get Here");
    }
    public static void main(String[] args) {
        Using_Runnable r = new Using_Runnable();
        Thread t1 = new Thread(r);
        t1.start();

    }
}

