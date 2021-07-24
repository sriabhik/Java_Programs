package Thread_learn;

//class MyTask extends Thread{

    //@Override  public  void run(){
        //for(int i = 0 ; i < 10 ;i++){
      //      System.out.println("printing Document : "+i + "  Printer 2");
    //    }
  //  }
//}
class CA{}
class MyTask extends CA implements Runnable{
    @Override
    public void run(){
        for(int i = 0 ; i < 10 ;i++){
            System.out.println("printing Document : "+i + "  Printer 2");
        }
    }
}
public class Apps {
    //main method represent main thread
    public static void main(String[] args) {
        //whatever we write here will be excecuted by main thread
        //thread always excute the jobs in a sequence
        //Excecution Context

        //job 1
        System.out.println("==Appliacation Started==");

        //job 2
        //MyTask task = new MyTask();//child thread .worker Thread
        //task.start();//-> start internally excecute run method

        Runnable r = new MyTask();//reference variable of the interface pointing to the object which implement its

        Thread t = new Thread(r);//thread object ,pass runnable refernce
        t.start();

        //till job 2 is not finished,below written code are waiting and are not executed
        //In case job 2 is long running operation i.e several document are supposed to be printed
        //In such a use case os/jvm give a message that app is not reponding
        //note:: main and MyTask run parllel//
        for(int i = 0 ; i < 10 ;i++){
            System.out.println("printing Document : "+i + "  Printer 1");
        }
        System.out.println("==Application Finished== ");
    }
}
