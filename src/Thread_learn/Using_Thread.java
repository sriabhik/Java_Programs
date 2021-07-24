package Thread_learn;


public class Using_Thread extends Thread{
    @Override
    public  void run(){
        System.out.println("Inside");
    }

    public static void main(String[] args) {
        Using_Thread t = new Using_Thread();
        t.start();
    }
}
