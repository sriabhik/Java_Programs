package Thread_learn;
class CA1{}
class MyTask1 extends CA1 implements Runnable{
    @Override
    public void run(){
        for(int i = 0 ; i < 10 ;i++){
            System.out.println("printing Document : "+i + "  Printer 2");
        }
    }
}
class YourTask extends CA1 implements Runnable{
    @Override
    public void run(){
        for(int i = 0 ; i < 10 ;i++){
            System.out.println("printing Document : "+i + "  Printer 3");
        }
    }
}
public class App {
    //main method represent main thread
    public static void main(String[] args) {

        System.out.println("==Appliacation Started==");

        //job 2
        //MyTask task = new MyTask();//child thread .worker Thread
        //task.start();//-> start internally excecute run method

        Runnable r = new MyTask1();//reference variable of the interface pointing to the object which implement its

        Thread t = new Thread(r);//thread object ,pass runnable refernce
        t.start();

        Thread t1 = new Thread(new YourTask());//same as using runnable r = new YourTask();
        t1.start();
        for(int i = 0 ; i < 10 ;i++){
            System.out.println("printing Document : "+i + "  Printer 1");
        }
        System.out.println("==Application Finished== ");
    }
}
